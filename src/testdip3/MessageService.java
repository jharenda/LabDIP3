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
public class MessageService {
   private MessageInputStrategy input;
    private MessageOutputStrategy output;
    
    //constructor stays the same
    public MessageService(MessageInputStrategy input, MessageOutputStrategy output) {
        this.input = input;
        this.output = output;
    }
// I like the name output instead of produce. It's all output no mater what form? 
    public  void outputMessage() {
        output.sendMessage(input);
    } 
}
