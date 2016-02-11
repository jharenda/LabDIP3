/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdip3;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class ConsoleMessageInputStrategy implements MessageInputStrategy {
Scanner keyboard = new Scanner(System.in); 
    @Override
    public Message getMessage() {
        System.out.println("Please enter Message: ");
      String message = keyboard.nextLine(); 
       Message msg = new Message(message);
        return msg;
      
    
}

}