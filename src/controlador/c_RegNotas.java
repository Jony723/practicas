package controlador;

import Modelo.Notas;
import controlador.tools.H_Util_adm;
import java.awt.HeadlessException;
import java.util.List;
import javax.persistence.ParameterMode;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.procedure.ProcedureCall;
import org.hibernate.result.Output;
import org.hibernate.result.ResultSetOutput;

/**
 *
 * @author Jony
 */
public class c_RegNotas {

    Notas n = new Notas();

    /////
    public List<Object[]> listarAlumnos(String codN, String año) {
        ///metodo para obtener la lista de los alumnos
        SessionFactory sf = H_Util_adm.getSessionFactory();
        Session se = sf.openSession();
        ///se llama al procedimiento almacenado y se le entrega los parametros
        ProcedureCall pc = se.createStoredProcedureCall("ver_alumnos");
        pc.registerParameter(0, String.class, ParameterMode.IN).bindValue(codN);
        pc.registerParameter(1, String.class, ParameterMode.IN).bindValue(año);
        Output ou = pc.getOutputs().getCurrent();
        List<Object[]> listAlumnos = ((ResultSetOutput) ou).getResultList();
        // se cierra la session
        se.close();
        return listAlumnos;
    }

    public List<Object[]> listarCursos(String codNiv) {
        SessionFactory sf = H_Util_adm.getSessionFactory();
        Session s = sf.openSession();
        ProcedureCall pc = s.createStoredProcedureCall("ver_codCursos");
        pc.registerParameter(0, String.class, ParameterMode.IN).bindValue(codNiv);
        Output ou = pc.getOutputs().getCurrent();
        List<Object[]> lisCursos = ((ResultSetOutput) ou).getResultList();
        s.close();
        return lisCursos;
    }

    public boolean registrarNotas(Notas n) {
        boolean registro = false;
        SessionFactory sf = H_Util_adm.getSessionFactory();
        Session s = sf.openSession();

        try {
            s.beginTransaction();
            s.save(n);
            s.getTransaction().commit();
            registro = true;
        } catch (Exception e) {
            if (e != null) {
                s.getTransaction().rollback();
                JOptionPane.showMessageDialog(null, e, "ERROR DE HIBERNATE", JOptionPane.ERROR_MESSAGE);
            }
        } finally {
            s.close();
        }

        return registro;
    }

    public String modificarNotas(Notas n) {
        String mensaje = null;
        SessionFactory sf = H_Util_adm.getSessionFactory();
        Session s = sf.openSession();
        try {
            s.beginTransaction();
            s.update(n);
            s.beginTransaction().commit();
        } catch (Exception e) {
            if (e != null) {
                s.beginTransaction().rollback();
                mensaje = "no se pudo modificar las notas";
            }
        }
        return mensaje;
    }

    public List<Object[]> verNotas(String año, String curso, String nivel) {
        List<Object[]> vn = null;
        SessionFactory sf = H_Util_adm.getSessionFactory();
        Session s = sf.openSession();
        try {
            ProcedureCall pc = s.createStoredProcedureCall("ver_NotasReg");
            pc.registerParameter(0, String.class, ParameterMode.IN).bindValue(año);
            pc.registerParameter(1, String.class, ParameterMode.IN).bindValue(curso);
            pc.registerParameter(3, String.class, ParameterMode.IN).bindValue(nivel);
            Output out = pc.getOutputs().getCurrent();
            List<Object[]> lNotas = ((ResultSetOutput) out).getResultList();
        } catch (Exception e) {
            if (e != null) {
                s.cancelQuery();
            }

        } finally {
            s.close();
        }

        return vn;
    }

    public void modNotas(Notas n) {
        SessionFactory sf = H_Util_adm.getSessionFactory();
        Session s = sf.openSession();
        try {
            s.beginTransaction();
            s.update(n);
            s.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Las notas an sido modificadas","Aviso",JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException e) {
            if (e != null) {
                s.getTransaction().rollback();
                JOptionPane.showMessageDialog(null, "Error de Conexion", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } finally {
            s.close();
        }
    }
}
