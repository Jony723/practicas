
package controlador;
import Modelo.Alumno;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class c_Alumno {

public void Registrar_alumno(Alumno a){
try{
    SessionFactory sf=H_Util_adm.getSessionFactory();
    Session s=sf.openSession();
    Transaction tx=s.beginTransaction();
    s.save(a);
    tx.commit();
    JOptionPane.showMessageDialog(null,"Alumno Registrado correctamente");
}catch(HibernateException e){
    JOptionPane.showMessageDialog(null,e,"ERROR DE CONEXION",JOptionPane.ERROR_MESSAGE);
}
}
}
