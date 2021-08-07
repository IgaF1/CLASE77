/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Automovil;
import javax.swing.JOptionPane;

/**
 *
 * @author 59399
 */
public class Aplicacion {
    
    public static void main(String[] args) {
        
        Automovil au1 = new Automovil();
        au1.setPlaca("HN337T");
        au1.setModelo("Shineray");
        au1.setColor("Negro Oscuro");
        
        JOptionPane.showMessageDialog(null,"Los datos de tu moto es : \n"+
                "Placa: "+au1.getPlaca()+
                "\nModelo: "+au1.getModelo()
                + "\nColor: "+au1.getColor());
   }
}   
                
        
   
