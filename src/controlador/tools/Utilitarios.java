/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.tools;

import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



/**
 *
 * @author Jony
 */
public class Utilitarios {
    public void Salir(){
    int x=JOptionPane.showConfirmDialog(null, "Desea Salir del sistema", "SALIR", JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
    if(x==JOptionPane.YES_OPTION){
        System.exit(0);
    }
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
