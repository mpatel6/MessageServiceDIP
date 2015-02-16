/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageservicedip;

/**
 *
 * @author Ankita
 */
public class ConsoleOutputStrategy implements OutputStrategy {

    @Override
    public void writeOutput(String outputText) {
        System.out.println("Here is the text that you entered: ");
        System.out.println(outputText);
    }

}
