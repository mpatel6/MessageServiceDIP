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
public class GuiOutputStrategy implements OutputStrategy {

    @Override
    public void writeOutput(String outputText) {
       JOptionPane.showMessageDialog(null, outputText);
    }
    
}
