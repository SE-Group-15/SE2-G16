/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.util.Date;

public class Payment {

    private int paymentId;
    private String paymentType;
    private Date paymentDate;
    private String paymentStatus;
    private int bill_ID; // Assuming bill_ID is an integer referencing the Bill class
    private float payment; // Assuming payment is a float representing the payment amount


    public Payment(int paymentId, String paymentType, Date paymentDate, String paymentStatus, int bill_ID, float payment) {
        this.paymentId = paymentId;
        this.paymentType = paymentType;
        this.paymentDate = paymentDate;
        this.paymentStatus = paymentStatus;
        this.bill_ID = bill_ID;
        this.payment = payment;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public int getBill_ID() {
        return bill_ID;
    }

    public void setBill_ID(int bill_ID) {
        this.bill_ID = bill_ID;
    }

    public float getPayment() {
        return payment;
    }

    public void setPayment(float payment) {
        this.payment = payment;
    }


    public void makePayment(float amount) {

        System.out.println("Payment made: $" + amount);
    }


} 