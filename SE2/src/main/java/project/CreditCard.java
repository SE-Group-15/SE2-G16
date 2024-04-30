/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import project.PaymentPattern;

/**
 *
 * @author omarb
 */
public class CreditCard implements PaymentPattern{
    private creditInfo card;
    
    @Override
     public void details(){
         card = new creditInfo("Card Number", "Expiry Card Date", "Address", "CVV");
     }
    
    
    @Override
    public void makePayment(int amount){
        System.out.println("Payment"+ amount + "Using Credit Card");
        card.setAmount(card.getAmount() - amount);
    }
    
    
    
    
}
