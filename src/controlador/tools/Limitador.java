/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.tools;

import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author jony
 */
public class Limitador extends PlainDocument{
        private JTextField editor;
    private int nun;

    public Limitador(JTextField editor, int nun) {
        this.editor = editor;
        this.nun = nun;
    }
    public void insertString(int arg0, String arg1, AttributeSet arg2)throws BadLocationException{
        if(editor.getText().length()+arg1.length()>this.nun){
            return;
        }super.insertString(arg0, arg1, arg2);
    }
}
