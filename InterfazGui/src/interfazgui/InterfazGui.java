/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazgui;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author laex2
 */
public class InterfazGui extends Thread {
    javax.swing.JLabel lblTexto;
    int contador;

    public InterfazGui(){
        contador = 1;
    }
 
    public void run(){
        while(true){
            lblTexto.setText("Ejecutando: " + contador++ );
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(InterfazGui.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void recibelblTexto(javax.swing.JLabel lblTexto){
        this.lblTexto = lblTexto;
    }
}
