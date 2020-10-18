/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MimiHMB
 */
import java.util.ArrayList;

public class MessagingService {
    private ArrayList<Message> mess;
    
    public MessagingService() {
        this.mess = new ArrayList<Message>(); 
    }
    
    public void add(Message message) {
        System.out.println(message);
        System.out.println(message.getContent());
        if (message.getContent().length() <= 280) {
            this.mess.add(message);
        }
    }
    
    public ArrayList<Message> getMessages() {
        return this.mess;
    }
}
