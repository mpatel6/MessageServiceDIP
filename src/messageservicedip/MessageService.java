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
public class MessageService {

    private InputStrategy input;
    private OutputStrategy output;
    private String text;

    public MessageService() {
    }
    
    

    public MessageService(InputStrategy input, OutputStrategy output) {
        setInput(input);
        setOutput(output);
    }

    public void workMessage() {
        
        getInput();
        displayOutput();

    }

    private void getInput() {
        this.text = input.readInput();
    }

    private void displayOutput() {
        output.writeOutput(text);
    }

    public void setInput(InputStrategy input) {
        this.input = input;
    }

    public void setOutput(OutputStrategy output) {
        this.output = output;
    }
    
    
}
