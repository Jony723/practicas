package controlador;

import Modelo.Notas;
import controlador.tools.H_Util_adm;
import java.util.List;
import javax.persistence.ParameterMode;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
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
    SessionFactory sf = H_Util_adm.getSessionFactory();
    Session se;
    /////

    public DefaultTableModel listarAlumnos(String codN, String año) {
        ///metodo para obtener la lista de los alumnos
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("N°");
        modelo.addColumn("Alumno");
        modelo.addColumn("Cod_Matricula");

        Object[] columna = new Object[3];
        ///se llama al procedimiento almacenado y se le entrega los parametros
        ProcedureCall pc = se.createStoredProcedureCall("ver_alumnos");
        pc.registerParameter(1, String.class, ParameterMode.IN).bindValue(codN);
        pc.registerParameter(1, String.class, ParameterMode.IN).bindValue(año);
        Output ou = pc.getOutputs().getCurrent();
        List<Object[]> listAlumnos = ((ResultSetOutput) ou).getResultList();
        if (listAlumnos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay  alumnos matriculados en este grado");
        } else {
            int nOrden = 1;
            for (Object[] datos : listAlumnos) {
                columna[0] = nOrden;
                columna[1] = (datos[1]);
                columna[2] = (datos[2]);
                modelo.addRow(columna);
                nOrden++;
            }
        }

        return modelo;
    }

    
    
    public void cerrarSession() {
        if (sf != null) {
            sf.close();
        }
    }

}
