package controlador;

import Modelo.Cursos;
import controlador.tools.H_Util_adm;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Jony
 */
public class c_Curso {

    public String registrar(Cursos c) {
        SessionFactory sf = H_Util_adm.getSessionFactory();
        Session s = sf.openSession();
        String mensaje = null;
        try {
            s.beginTransaction();
            s.save(c);
            s.getTransaction().commit();
            mensaje = "Se registro curso con exito";
        } catch (HibernateException e) {
            if (e != null) {
                mensaje = "NO se pudo registrar curso \n" + e;
                s.getTransaction().rollback();
            }
        } finally {
            if (s != null) {
                s.close();
            }

        }
        return mensaje;
    }

   
    public String Modificar(Cursos c) {
        String mensaje=null;
        SessionFactory sf = H_Util_adm.getSessionFactory();
        Session s = sf.openSession();
        try {
            s.beginTransaction();
            s.update(c);
            s.getTransaction().commit();
            mensaje="Se Modifico curso con exito";
        } catch (HibernateException e) {
            if (e != null) {
                mensaje="ERROR DE CONEXION, \n"+e;
                s.getTransaction().rollback();
            }
        } finally {
            if (s != null) {
                s.close();
            }

        }
        return mensaje;
    }

    public List<Object[]> ListarCursos() {

        SessionFactory sf = H_Util_adm.getSessionFactory();
        Session s = sf.openSession();
        List<Object[]> listCursos = null;
        try {
            Query q = s.createQuery("select codCurso,descripcion,area,condicion from Cursos");
            listCursos = q.list();

        } catch (HibernateException e) {
            if (e != null) {
                JOptionPane.showMessageDialog(null, "Error de conexion \n" + e,"ERROR",JOptionPane.ERROR_MESSAGE);
                s.getTransaction().rollback();
            }
        } finally {
            if (s != null) {
                s.close();
            }
        }
        return listCursos;
    }

}
