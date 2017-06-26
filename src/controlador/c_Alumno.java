
package controlador;
import controlador.tools.H_Util_adm;
import Modelo.Alumno;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;



public class c_Alumno {

public void Registrar_alumno(Alumno a){

    SessionFactory sf=H_Util_adm.getSessionFactory();
    Transaction tx=null;
    Session s=sf.openSession();
    /// validacion,creamos una query q nos devuelva un valor entero
    long x=(long)s.createQuery("select count(codAlumno)from Alumno where codAlumno='"+a.getCodAlumno()+"'").uniqueResult();
    if(x==0){//se pregunta si existe algun alumno con el mismo codigo   
    tx=s.beginTransaction();
    s.save(a);
    tx.commit();
    JOptionPane.showMessageDialog(null,"se registro correctamente al alumno");
    }else{// si existe 1 codigo igual
    JOptionPane.showMessageDialog(null,"NO se puede registrar 2 alumnos con un el mismo numero de DNI","Verifique",JOptionPane.WARNING_MESSAGE);
    }
    s.clear();
    s.close();
    H_Util_adm.closeSessionFactory();
      
}

public DefaultTableModel busquedaAlumno(int n,String par){
   
    DefaultTableModel modelo=new DefaultTableModel();//variable modelo q va a retornar a la vista
    String query=null;
    Object [] columna =new Object[6];
  if(n==1){///se carga la variable Stringcon la query segun sea el caso, con los parametros deseados
       query="select codAlumno, nombres,apaterno,amaterno,estado,year(fechaNac)||'-'||month(fechaNac)||'-'||day(fechaNac) from Alumno where codAlumno='"+par+"'";
   }else{
       query="select codAlumno, nombres,apaterno,amaterno,estado,year(fechaNac)||'-'||month(fechaNac)||'-'||day(fechaNac) from Alumno where apaterno='"+par+"'";
   }
    ///columnas de la tabla
    modelo.addColumn("Codigo");
    modelo.addColumn("Nombre");
    modelo.addColumn("Apellido Pat");
    modelo.addColumn("Apellido Mat");
    modelo.addColumn("Estado");
    modelo.addColumn("Fecha Nac");
    ////
    SessionFactory sf=H_Util_adm.getSessionFactory();///se obtiene session
    Session s=sf.openSession();//se abre sseion
    Query q=s.createQuery(query);//se crea la variable Query y se carga con la variable String 
    List<Object[]> listDatos = q.list();// se ejecuta la query y se obtiene una lista de objetos con los datos
    if(listDatos.isEmpty()){
        JOptionPane.showMessageDialog(null,"no se encontraron alumnos");
    }else{
         for (Object[] datos : listDatos) {
        columna[0]=(datos[0] ); 
        columna[1]=(datos[1]);
        columna[2]=(datos[2]);
        columna[3]=(datos[3]);
        columna[4]=(datos[4]);
        columna[5]=(datos[5]);
        modelo.addRow(columna);
        }
    
    }
   
    s.clear();
    s.close();
    H_Util_adm.closeSessionFactory();
    return modelo;
}



}

