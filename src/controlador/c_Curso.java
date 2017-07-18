package controlador;

import Modelo.Cursos;
import controlador.tools.H_Util_adm;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Jony
 */
public class c_Curso {
   SessionFactory sf=H_Util_adm.getSessionFactory();
    
    public void registrar(Cursos c){
        Session s=sf.openSession();
        try{
            s.beginTransaction();
            s.save(c);
            s.getTransaction().commit();
            JOptionPane.showMessageDialog(null,"Se registro curso con exito");
        }catch(HibernateException e){
            if(e!=null){
              JOptionPane.showMessageDialog(null, e);
              s.getTransaction().rollback();
            }
        }finally{
           if(s!=null){
               s.close();
           }
            
        }
    }
    
    public void Eliminar(Cursos c){
        Session s=sf.openSession();
        try{
            s.beginTransaction();
            s.delete(c);
            s.getTransaction().commit();
            JOptionPane.showMessageDialog(null,"Se Elimino curso con exito");
        }catch(HibernateException e){
            if(e!=null){
              JOptionPane.showMessageDialog(null, e);
              s.getTransaction().rollback();
            }
        }finally{
             if(s!=null){
               s.close();
           }
            
        }
    }
    
    public void Modificar(Cursos c){
        Session s=sf.openSession();
        try{
            s.beginTransaction();
            s.update(c);
            s.getTransaction().commit();
            JOptionPane.showMessageDialog(null,"Se Modifico curso con exito");
        }catch(HibernateException e){
            if(e!=null){
              JOptionPane.showMessageDialog(null, e);
              s.getTransaction().rollback();
            }
        }finally{
             if(s!=null){
               s.close();
           }
            
        }
    }
    
    public DefaultTableModel ListarCursos(){
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre o descripción");
        modelo.addColumn("Area");
        modelo.addColumn("Condicion");
        Object[] columna=new Object[4];
        Session s=sf.openSession();
        try{
            Query q=s.createQuery("select codCurso,descripcion,area,condicion from Cursos");
            List<Object[]>listCursos =q.list();
            for(Object[] datos: listCursos){
               columna[0]=(datos[0]);
               columna[1]=(datos[1]);
               columna[2]=(datos[2]);
               columna[3]=(datos[3]);
            modelo.addRow(columna);
                
            }
        }catch(HibernateException e){
            if(e!=null){
              JOptionPane.showMessageDialog(null, e);
              s.getTransaction().rollback();
            }
        }finally{
            if(s!=null){
               s.close();
           } 
        }
        return modelo;
    }
    
    public void CerrarCurso(){
       if(sf!=null){
           sf.close();
           
       } 
    }
}
