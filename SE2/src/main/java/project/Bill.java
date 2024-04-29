/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author DELL
 */
import java.util.ArrayList;
import java.util.Date;

public class Bill {
    private int bill_ID;
    private ArrayList<Customer> customers;
    private float billAmount;
    private Date billDate;
    private String billStatus;
    private double taxrate=0.1;
    private double additionalcharge2;
    private double AddDiscount=0.05;

    public Bill(int bill_ID, ArrayList<Customer> customers, float billAmount, Date billDate, String billStatus) {
        this.bill_ID = bill_ID;
        this.customers = customers;
        this.billAmount = billAmount;
        this.billDate = billDate;
        this.billStatus = billStatus;
    }

    public Bill() {
    }


    public int getBill_ID() {
        return bill_ID;
    }

    public void setBill_ID(int bill_ID) {
        this.bill_ID = bill_ID;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public float getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(float billAmount) {
        this.billAmount = billAmount;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public String getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(String billStatus) {
        this.billStatus = billStatus;
    }
  public void sendNotification(String message) {
        System.out.println("Notification sent: " + message);
    }

    public void viewBill(int userID) {
        System.out.println("Viewing bill for user with ID: " + userID);
    }

    public void selectBill() {
        System.out.println("Bill selected");
    }
    public double tax(double consumption){
     double taxamount=consumption*taxrate;
     
        return taxamount;
    }
       public double additionalCharge1(double consumption){
     
      if(consumption<900)
       {
           additionalcharge2 =10;
       }
       else if(consumption>900 && consumption <1200 )
       {
           additionalcharge2 =20;
       }

       else if(consumption>1200 && consumption <1500 )
       {
           additionalcharge2 =30;
       }
       else
       {
           additionalcharge2 =50;
       }
double additionalcharge=consumption*additionalcharge2;
        return additionalcharge;
    }
       
       public double AddDiscount1(double consumption){ 
       double discountamount2;
       discountamount2=AddDiscount*consumption;
       return discountamount2;
       }

}