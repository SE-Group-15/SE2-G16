/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author omarb
 */
public class Fawry implements PaymentPattern {
   
    private String email;
    private String password;
    
    @Override
     public void details(){
         email = " ";
         password = " ";
     }
    
    
    @Override
    public void makePayment(int amount){
        System.out.println("Payment"+ amount + "Using Fawry");
    }
    
    
}
