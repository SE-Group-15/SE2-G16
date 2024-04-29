/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author DELL
 */
public class Customer  {
    private int customerId;
    private String customerName;
    private double consumption;
    private Bill bill;
    private Inquiry inquiry;
    private ConsumptionROI i;


     public Customer(int customerId, String customerName, double consumption, Bill bill, Inquiry inquiry, ConsumptionROI i) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.consumption = consumption;
        this.bill = bill;
        this.inquiry = inquiry;
        this.i = i;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public Inquiry getInquiry() {
        return inquiry;
    }

    public void setInquiry(Inquiry inquiry) {
        this.inquiry = inquiry;
    }

   public void getConsumption(double Consumption)
      {
          i.getConsumption(Consumption);
      }

//    @Override
//    public String toString() {
//        return "Customer{" +
//                "customerId=" + customerId +
//                ", customerName='" + customerName + ''' +
//                ", consumption=" + consumption +
//                ", bill=" + bill +
//                ", inquiry=" + inquiry +
//                '}';
//    }
}