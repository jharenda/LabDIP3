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
public class FileMessageInputStrategy implements MessageInputStrategy{
private boolean lineReadFlag = false;
	
    @Override
    public Message getMessage() {

       // need to get something from file, 
       File data = new File("t.txt");
            
                // Do this if locating data file outside of project (preferred)
                // File is located at the root of the root drive (likely "E" in class)
		//File data = new File(File.separator + "data.txt");

		BufferedReader in = null;
		String line = null;
			  
		try {
			if ( data.exists() ){
				// make sure we differentiate between java.io.FileReader
				// class and this custom FileReader class
				in = new BufferedReader( new java.io.FileReader(data) );
				line = in.readLine();
				in.close();
			} else {
				System.out.println("File not found - data.txt");
				line = null;
			}
		} catch (IOException ioe) {
			try {
				if( in != null ) in.close();
			} catch(IOException ioe2) {
				System.out.println( ioe2.getMessage() );
			}
			System.out.println( ioe.getMessage() );
			System.exit(1);  // 1 = signals program end with error
		}
			  
		// ugly hack so we can end the program after reading a line
		if( lineReadFlag ) {
			return null;
		} else {
			lineReadFlag = true;
                }
		 Message msg = new Message(line);
        return msg;
       
		}
	}

      
    

