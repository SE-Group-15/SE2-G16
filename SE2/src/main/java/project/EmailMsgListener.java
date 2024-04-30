/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.util.EventListener;

/**
 *
 * @author Ahmed
 */
public class EmailMsgListener implements EventListener{
    private final String Email;
    public EmailMsgListener(String Email){
        this.Email=Email;
    }
    public void update(String news) {
        System.out.println(Email + " recevied an email that says: " + news);
    }
}
