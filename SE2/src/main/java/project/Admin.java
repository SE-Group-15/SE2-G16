/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author DELL
 */
public class Admin {

    private int adminID;
    private Inquiry inquiry;
    private double c1;
    private double c2;
    private double c3;
    private double c4;

     public Admin(int adminID, Inquiry inquiry,double c1, double c2, double c3, double c4) {
        this.adminID = adminID;
        this.inquiry = inquiry;
        this.c1= c1;
        this.c2=c2;
        this.c3=c3;
        this.c4=c4;
    }
     
     public Admin(double c1,double c2,double c3,double c4){
         this.c1=c1;
         this.c2=c2;
         this.c3=c3;
         this.c4=c4;
     }

 
    public int getAdminID() {
        return adminID;
    }

    public void setAdminID(int adminID) {
        this.adminID = adminID;
    }


    public Inquiry getInquiry() {
        return inquiry;
    }

    public void setInquiry(Inquiry inquiry) {
        this.inquiry = inquiry;
    }
    
        public void setC1(double c1) {
        this.c1 = c1;
    }

    public void setC2(double c2) {
        this.c2 = c2;
    }

    public void setC3(double c3) {
        this.c3 = c3;
    }

    public void setC4(double c4) {
        this.c4 = c4;
    }

    public double getC1() {
        return c1;
    }

    public double getC2() {
        return c2;
    }

    public double getC3() {
        return c3;
    }

    public double getC4() {
        return c4;
    }


}