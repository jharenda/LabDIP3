/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdip3;
import java.io.*; 
/**
 *
 * @author Jennifer
 */
public class TestDIP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception  {
        
        
        
         Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("t.txt"), "utf-8")); 
   writer.write("something");
    
     //  MessageInputStrategy input = new  FileMessageInputStrategy();
     MessageInputStrategy input = new  ConsoleMessageInputStrategy();
        MessageOutputStrategy output = new ConsoleMessageOutputStrategy();
      
        
        
        MessageService service = new MessageService(input, output);
        service.outputMessage();
    }
    
}
