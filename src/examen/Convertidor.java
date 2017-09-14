
package examen;
/**
 *
 * @author Stephanie González Villafuerte Grupo: 5IM8
 * @version 1.0
 */

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

    public class Convertidor implements ActionListener{
    // Se declaran las variables
     
    private JFrame _ventanita;
    public JButton _convertir,num0,num1,num2,num3,num4,num5,num6,num7,num8,num9,borrar;
    public JTextField _text;
    public JLabel _label;
    public Container _contenedor;
    Componentes crear  = new Componentes();
    
    public Convertidor(){
       _ventanita = crear.creadorFRM("Convertidor Peso-Dólar",100, 100, 450, 400,false);
       _contenedor = _ventanita.getContentPane();
       componentes();
    }
    // Se escribe el metodo que mostrara la ventana
     
    public void mostrar(){
     _ventanita.setVisible(true);
    }
    //Se definen los componentes de la ventana
     
    public void componentes(){
        _label = crear.creadorLBL("Convertidor Pesos-Dolares",10 , 5, 200,50);
        _text = crear.creadorTXT("",10, 31, 400, 59);
	_contenedor.add(_text);
        
        num0 = crear.creadorBTN("0", 110, 300, 50, 40);
        num1 = crear.creadorBTN("1", 40, 100, 50, 40);
        num2 = crear.creadorBTN("2", 110, 100, 50, 40);
        num3 = crear.creadorBTN("3", 180, 100, 50, 40);
        num4 = crear.creadorBTN("4", 40, 170, 50, 40);
        num5 = crear.creadorBTN("5", 110, 170, 50, 40);
        num6 = crear.creadorBTN("6", 180, 170, 50, 40);
        num7 = crear.creadorBTN("7", 40, 240, 50, 40);
        num8 = crear.creadorBTN("8", 110, 240, 50, 40);
        num9 = crear.creadorBTN("9", 180, 240, 50, 40);
       
      
        _convertir = crear.creadorBTN("Convertir", 250, 170, 150, 40);
        borrar = crear.creadorBTN("Limpiar",250,100,150, 40);
        
        num0.addActionListener(this);
        num1.addActionListener(this);
        num2.addActionListener(this);
        num3.addActionListener(this);
        num4.addActionListener(this);
        num5.addActionListener(this);
        num6.addActionListener(this);
        num7.addActionListener(this);
        num8.addActionListener(this);
        num9.addActionListener(this);
        _convertir.addActionListener(this);
        borrar.addActionListener(this);
        
        // Se añaden elementos al contenedor
         
        _contenedor.add(num0);
        _contenedor.add(num1);
        _contenedor.add(num2);
        _contenedor.add(num3);
        _contenedor.add(num4);
        _contenedor.add(num5);
        _contenedor.add(num6);
        _contenedor.add(num7);
        _contenedor.add(num8);
        _contenedor.add(num9);
        _contenedor.add(_convertir);
        _contenedor.add(borrar);
        
        
        
        
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        // Se le asigna un valor al textfield según el botón que haya sido presionado
        
        if(ae.getSource()==num0){
           _text.setText(_text.getText().concat("0"));
        }
        else{
            if(ae.getSource()==num1){
                _text.setText(_text.getText().concat("1"));
            }
            else{
                if(ae.getSource()==num2){
                    _text.setText(_text.getText().concat("2"));
                }
                else{
                    if(ae.getSource()==num3){
                        _text.setText(_text.getText().concat("3"));
                    }
                    else{
                        if(ae.getSource()==num4){
                            _text.setText(_text.getText().concat("4"));
                        }
                        else{
                            if(ae.getSource()==num5){
                                _text.setText(_text.getText().concat("5"));
                            }
                            else{
                                if(ae.getSource()==num6){
                                    _text.setText(_text.getText().concat("6"));
                                }
                                else{
                                    if(ae.getSource()==num7){
                                        _text.setText(_text.getText().concat("7"));
                                    }
                                    else{
                                        if(ae.getSource()==num8){
                                            _text.setText(_text.getText().concat("8"));
                                        }
                                        else{
                                            if(ae.getSource()==num9){
                                                _text.setText(_text.getText().concat("9"));
                                            }
                                            else{
                                                if(ae.getSource()==_convertir){
                                                    //Se realiza la conversión a dolares
                                                    try{
                                                        Componentes conv = new Componentes();
                                                        _text.setText(conv.conversión(_text.getText()));
                                                    }
                                                    catch(Exception e){
                                                        JOptionPane.showMessageDialog(_ventanita,"Introduce algo correcto");
                                                    }
                                                    
                                                }
                                                else{
                                                    // Elimina contenido del Textfield
                                                    if(ae.getSource()==borrar){
                                                        _text.setText(" ");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
}

    
		

    