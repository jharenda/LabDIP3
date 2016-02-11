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
public class Message {
        private String messageAsString;
   
    
    public Message(String strMsg) {
        messageAsString = strMsg;
    }


    public String getMessageAsString() {
        return messageAsString;
    }

    public void setMessageAsString(String message) {
        this.messageAsString = message;
    }

}


