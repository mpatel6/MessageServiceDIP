/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageservicedip;


import javax.swing.JOptionPane;
/**
 *
 * @author Ankita
 */
public class GuiInputStrategy implements InputStrategy {

    @Override
    public String readInput() {
        
        return JOptionPane.showInputDialog("Enter text: ");
        
    }
    
}
