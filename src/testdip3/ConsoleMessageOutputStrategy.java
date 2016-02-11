/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdip3;

/**
 *
 * @author Jennifer
 */
public class ConsoleMessageOutputStrategy implements MessageOutputStrategy {

    @Override
    public void sendMessage(final MessageInputStrategy msgInput) {
        Message msg = msgInput.getMessage();
        System.out.println(msg.getMessageAsString());
    }
    
}
