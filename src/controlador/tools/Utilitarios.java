/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.tools;

import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import vista.FrmInicio;



/**
 *
 * @author Jony
 */
public class Utilitarios {
    
    public DefaultComboBoxModel modeloNG(){
        DefaultComboBoxModel modelo=new DefaultComboBoxModel();
        modelo.addElement("Seleccione");
        modelo.addElement("1° Primaria");
        modelo.addElement("2° Primaria");
        modelo.addElement("3° Primaria");
        modelo.addElement("4° Primaria");
        modelo.addElement("5° Primaria");
        modelo.addElement("6° Primaria");
        modelo.addElement("1° Secundaria");
        modelo.addElement("2° Secundaria");
        modelo.addElement("3° Secundaria");
        modelo.addElement("4° Secundaria");
        modelo.addElement("5° Secundaria");
        return modelo;
    }
    
    public void Salir(){
    int x=JOptionPane.showConfirmDialog(null, "Desea Salir del sistema", "SALIR", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
    if(x==JOptionPane.YES_OPTION){
        System.exit(0);
    }
}
    public void limitadorTxt(JTextField text,int canCaracteres){
        if (text.getText().length() > canCaracteres) {
            String texto = text.getText(); // Capturamos texto digitado
            texto = texto.substring(0, texto.length() - 1); // Descartar la ultima tecla ingresada
            Toolkit.getDefaultToolkit().beep();
            text.setText(texto);
            // Mensaje de error
        }
    }
    
    public boolean menuI(){
        boolean resp=false;
        int i=JOptionPane.showConfirmDialog(null,"¿Desea regresar al Menu inicio?", "Inicio",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(i==JOptionPane.YES_OPTION){
            resp=true;
            FrmInicio meI = new FrmInicio();
            meI.setVisible(true);
        }
        return resp;
    }
    
    public void validar(String x,JTextField t){
        /// x tipo de validacion L= letras N= numeros
        ////t textbox a validar
      t.addKeyListener(new KeyAdapter() {
        @Override
        public void keyTyped(KeyEvent e){
            char c=e.getKeyChar();
            if(x.equalsIgnoreCase("L")){
                if(Character.isDigit(c)){
                    e.consume();
                    Toolkit.getDefaultToolkit().beep();
                }
            }else{
                if(Character.isLetter(c)){
                    e.consume();
                    Toolkit.getDefaultToolkit().beep();
                }
                
            }
        }  
      });
    }
        
    public void LimpiarTxt(JPanel panel){
        for(int i=0;panel.getComponents().length>i;i++){
            if(panel.getComponents()[i]instanceof JTextField){
                ((JTextField)panel.getComponents()[i]).setText(null);
            }
        }
    }
}
