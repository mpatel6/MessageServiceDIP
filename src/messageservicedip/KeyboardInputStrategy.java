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
public class KeyboardInputStrategy implements InputStrategy {

    @Override
    public String readInput() {
        System.out.print("\nEnter Text: ");
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextLine();

    }

}
