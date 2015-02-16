/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageservicedip;

import java.util.Scanner;

/**
 *
 * @author Ankita
 */
public class Startup {

    public static void main(String[] args) {
        int inputChoice;
        int outputChoice;
        InputStrategy input;
        OutputStrategy output;
        MessageService message = new MessageService();
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter choice for input type:- 1: Console, 2: GUI   :- ");
        inputChoice = keyboard.nextInt();
        keyboard.nextLine();
        System.out.print("Enter choice for output type:- 1: Console, 2: GUI   :- ");
        outputChoice = keyboard.nextInt();
//        keyboard.nextLine();

//
//        if (inputChoice == 1) {
//            input = new KeyboardInputStrategy();
//           
//        } else if (inputChoice == 2) {
//            input = new GuiInputStrategy();
//
//        }
//        
//        if (outputChoice == 1) {
//
//            output = new ConsoleOutputStrategy();
//        } else if (outputChoice == 2) {
//
//            output = new GuiOutputStrategy();
//        }
        //
        if (inputChoice == 1) {
            input = new KeyboardInputStrategy();
            message.setInput(input);

        } else if (inputChoice == 2) {
            input = new GuiInputStrategy();
            message.setInput(input);
        }

        if (outputChoice == 1) {

            output = new ConsoleOutputStrategy();
            message.setOutput(output);

        } else if (outputChoice == 2) {

            output = new GuiOutputStrategy();
            message.setOutput(output);
        }

//        input = new KeyboardInputStrategy();
//        output = new ConsoleOutputStrategy();
//        message = new MessageService(input, output);
          message.workMessage();
    }

}
