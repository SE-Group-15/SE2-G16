/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.util.ArrayList;

/**
 *
 * @author Ahmed
 */
public class NotificationServiceObserver {
 //   private Account account;
//    account=Account.getInstance();

            private final ArrayList<EmailMsgListener> customers;
            public NotificationServiceObserver(){
                customers=new ArrayList<>();
            }
            
            public void Subscribe(EmailMsgListener listener){
                customers.add(listener);
            }
             public void unSubscribe(EmailMsgListener listener){
                customers.remove(listener);
            }
              
    public void updateAll(String news) {
        for (int i = 0; i < customers.size(); i++) {
            customers.get(i).update(news);
        }
            
}
}
