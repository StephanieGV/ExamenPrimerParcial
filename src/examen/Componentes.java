
package examen;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

/**
 *
 * @author Stephanie González Villafuerte
 * @version 1.0
 */
public class Componentes implements ActionListener{
    /**
     * Se declaran las variables para crear los componentes
     */
    public JButton _btn;
    public JLabel _lbl; 
    public JTextField _txt;
    public JFrame _frm;
    public JTextArea _txta;
    private Container cont;
 
    public Componentes(){
        
    }
    
    public JFrame creadorFRM(String Tit, int x, int y, int Tamx, int Tamy, boolean Res){
        _frm= new JFrame(Tit);
        _frm.setBounds(x, y, Tamx, Tamy);
        _frm.setLocationRelativeTo(null);
        _frm.setLayout(null);
        _frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        _frm.setVisible(false);
        
        if (Res) {
            _frm.setResizable(true);
        }else{
            _frm.setResizable(false);
        }
       
        return this._frm;
    }
    // Se crean los botones
    public JButton creadorBTN(String Nombre, int x, int y, int Tamx, int Tamy){
        _btn = new JButton(Nombre);
        _btn.setBounds(x, y, Tamx, Tamy);
        _btn.setVisible(true);
        _btn.setLayout(null);

       
        return this._btn;
    }
    // Se crean los label
    public JLabel creadorLBL(String Nombre, int x, int y, int Tamx, int Tamy){
        _lbl = new JLabel(Nombre);
        _lbl.setBounds(x, y, Tamx, Tamy);
        _lbl.setVisible(true);
       
        return this._lbl;
    }
    // Se crea un JTextField
    public JTextField creadorTXT(String Info, int x, int y, int Tamx, int Tamy){
        _txt = new JTextField();
        _txt.setBounds(x, y, Tamx, Tamy);
        _txt.setText(Info);
        _txt.setEditable(true);
        _txt.setVisible(true);
       
        return this._txt;
    }
    // Se crea el JTextArea
    public JTextArea creadorTXTA(String Info, int x, int y, int Tamx, int Tamy){
        _txta = new JTextArea();
        _txta.setBounds(x, y, Tamx, Tamy);
        _txta.setText(Info);
        _txta.setVisible(true);
       
        return this._txta;
    }
    // Se declara la operación que realizara en este caso la conversión
    public String conversión(String num){
            String resul ="";
            float numero;
            numero = Float.parseFloat(num);
            float resultado;
        
        try {
            
            resultado = numero / 19;
            resul = "$US (Dolares) = " + Float.toString(resultado);
            
        }
        catch(Exception e){
            resul = "Error";
        }
        return resul;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

   
}


