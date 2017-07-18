package controlador;

import Modelo.Matricula;
import Modelo.Nivel;
import controlador.tools.H_Util_adm;
import java.awt.HeadlessException;
import java.util.List;
import javax.persistence.ParameterMode;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.procedure.ProcedureCall;
import org.hibernate.result.Output;
import org.hibernate.result.ResultSetOutput;

/**
 *
 * @author Jony
 */
public class c_Matriculas {

    /*SessionFactory sf = H_Util_adm.getSessionFactory();
    Session s;*/
    public boolean busqAlumno(String codigo) {
        SessionFactory sf = H_Util_adm.getSessionFactory();
        Session s = sf.openSession();
        boolean v = false;
        long alm = 0;
        try {
            //s = sf.openSession();
            alm = (long) s.createQuery("select count(*)from Alumno where codalumno='" + codigo + "' AND estado='Activo'").uniqueResult();

        } catch (HeadlessException | HibernateException e) {
            if (e != null) {
                s.cancelQuery();
            }
        } finally {
            if (alm != 0) {
                v = true;
            }
           
            s.close();
        }
        System.out.println(v);
        return v;
    }

    public String Registrar(Matricula matri) {
        SessionFactory sf = H_Util_adm.getSessionFactory();
        Session s = sf.openSession();
        String mensaje = null;
        try {
            //s = sf.openSession();
            s.beginTransaction();
            s.save(matri);
            s.getTransaction().commit();
            mensaje = "Alumno matriculado";

        } catch (HibernateException e) {
            if (e != null) {
                s.getTransaction().rollback();
                mensaje = "no se pudo realizar la matricula";
            }
        } finally {
           
            s.close();
        }
        return mensaje;
    }

    public String Modificar(Matricula matri) {
        SessionFactory sf = H_Util_adm.getSessionFactory();
        Session s = sf.openSession();
        String mensaje = null;
        try {
            //s = sf.openSession();
            s.beginTransaction();
            s.update(matri);
            s.getTransaction().commit();
            mensaje = "Matricula modificada correctamente";
        } catch (HibernateException e) {
            if (e != null) {
                s.getTransaction().rollback();
                mensaje = "no se pudo modificar la matricula";
            }
        } finally {
           
            s.close();
        }
        return mensaje;
    }

    public void Eliminar(Matricula matri) {
        SessionFactory sf = H_Util_adm.getSessionFactory();
        Session s = sf.openSession();
        try {
            // s = sf.openSession();
            s.beginTransaction();
            s.delete(matri);
            s.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Matricula eliminada con exito");
        } catch (HibernateException e) {
            if (e != null) {
                s.getTransaction().rollback();
                s.clear();
                JOptionPane.showMessageDialog(null, "no se pudo ELIMINAR la matricula", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } finally {
            
            s.close();
        }
    }

    public List<Object[]> listaMatriculas(String año, Nivel n, String idAl, int t) {
        SessionFactory sf = H_Util_adm.getSessionFactory();
        Session s = sf.openSession();
        ProcedureCall procCall = null;
        Output out = null;
        List<Object[]> matriculas = null;
        switch (t) {
            case 1:
                procCall = s.createStoredProcedureCall("busc_matriculaCodNivel");
                procCall.registerParameter(0, String.class, ParameterMode.IN).bindValue(año);
                procCall.registerParameter(1, String.class, ParameterMode.IN).bindValue(n.getIdNivel());
                break;
            case 2:
                procCall = s.createStoredProcedureCall("busc_matriculaCod");
                procCall.registerParameter(0, String.class, ParameterMode.IN).bindValue(idAl);
                break;
        }
        try {
            out = procCall.getOutputs().getCurrent();
            matriculas = ((ResultSetOutput) out).getResultList();
        } catch (HibernateException e) {
            if (e != null) {
                s.cancelQuery();
                JOptionPane.showMessageDialog(null, "NO se pudo completar la solicitud \n" + e, "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } finally {
           
            s.close();
        }
        return matriculas;
    }

}
