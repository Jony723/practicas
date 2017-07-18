package controlador;

import controlador.tools.H_Util_adm;
import Modelo.Alumno;
import java.awt.HeadlessException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class c_Alumno {

    public void Registrar_alumno(Alumno a) {
        SessionFactory sf = H_Util_adm.getSessionFactory();// se crea la variable q administrar todas las sesiones
        Session s = null;
        String mensaje = null;
        try {
            s = sf.openSession();
            /// validacion,creamos una query q nos devuelva un valor entero
            long x = (long) s.createQuery("select count(codAlumno)from Alumno where codAlumno='" + a.getCodAlumno() + "'").uniqueResult();
            if (x == 0) {//se pregunta si existe algun alumno con el mismo codigo   
                s.beginTransaction();
                s.save(a);
                s.getTransaction().commit();
                mensaje = "se registro correctamente al alumno";

            } else {
                mensaje = "Existe un alumno registrado con este número de DNI";
            }
            JOptionPane.showMessageDialog(null, mensaje, "Registrar", JOptionPane.INFORMATION_MESSAGE);
        } catch (HibernateException e) {
            if (e != null) {
                s.getTransaction().rollback();
                mensaje = "Error de Conexion no se realizo ninguna acción \n" + e;
                JOptionPane.showMessageDialog(null, mensaje, "ERROR DE SISTEMA", JOptionPane.ERROR_MESSAGE);
            }
        } finally {
            s.close();
        }
    }

    public DefaultTableModel busquedaAlumno(int n, String par) {
        SessionFactory sf = H_Util_adm.getSessionFactory();// se crea la variable q administrar todas las sesiones

        DefaultTableModel modelo = new DefaultTableModel();//variable modelo q va a retornar a la vista
        String query = null;
        Object[] columna = new Object[6];
        if (n == 1) {///se carga la variable Stringcon la query segun sea el caso, con los parametros deseados
            query = "select codAlumno, nombres,apaterno,amaterno,estado,year(fechaNac)||'-'||month(fechaNac)||'-'||day(fechaNac) from Alumno where codAlumno='" + par + "'";
        } else {
            query = "select codAlumno, nombres,apaterno,amaterno,estado,year(fechaNac)||'-'||month(fechaNac)||'-'||day(fechaNac) from Alumno where apaterno='" + par + "'";
        }
        ///columnas de la tabla
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido Pat");
        modelo.addColumn("Apellido Mat");
        modelo.addColumn("Estado");
        modelo.addColumn("Fecha Nac");
        ////

        Session s = sf.openSession();//se abre sseion
        Query q = s.createQuery(query);//se crea la variable Query y se carga con la variable String 
        List<Object[]> listDatos = q.list();// se ejecuta la query y se obtiene una lista de objetos con los datos
        s.close();
        if (listDatos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "no se encontraron alumnos");

        } else {
            for (Object[] datos : listDatos) {
                columna[0] = (datos[0]);
                columna[1] = (datos[1]);
                columna[2] = (datos[2]);
                columna[3] = (datos[3]);
                columna[4] = (datos[4]);
                columna[5] = (datos[5]);
                modelo.addRow(columna);
            }
        }

        return modelo;
    }

    public void Actualizar(Alumno a) {
        SessionFactory sf = H_Util_adm.getSessionFactory();// se crea la variable q administrar todas las sesiones
        Session s = sf.openSession();
        try {
            s.beginTransaction();
            s.update(a);
            s.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Se nodificaron los datos , exitosamente");
        } catch (HibernateException e) {
            if (e != null) {
                s.getTransaction().rollback();
                JOptionPane.showMessageDialog(null, "No se pudo modificar los datos del alumno \n" + e, "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } finally {
            s.close();
        }
    }

    public void Eliminar(Alumno a) {
        SessionFactory sf = H_Util_adm.getSessionFactory();// se crea la variable q administrar todas las sesiones
        Session s = sf.openSession();
        try {
            s.beginTransaction();
            s.delete(a);
            s.beginTransaction().commit();
            JOptionPane.showMessageDialog(null, "Se elimino Alumno satisfactoriamente");
            //System.out.println("codigo" + a.getCodAlumno());
        } catch (HeadlessException e) {
            if(e!=null){
                s.getTransaction().rollback();
                JOptionPane.showMessageDialog(null,"NO SE PUDO ELIMINAR AL ALUMNO \n"+ e,"ERROR",JOptionPane.ERROR_MESSAGE);
            }
        } finally {
            s.close();
        }

    }

}
