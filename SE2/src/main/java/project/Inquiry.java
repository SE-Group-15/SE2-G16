/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.util.Date;

public class Inquiry {

    private int inquiryid;
    private String inquiryinfo;
    private Date inquirydate;


    public Inquiry(int inquiryid, String inquiryinfo, Date inquirydate) {
        this.inquiryid = inquiryid;
        this.inquiryinfo = inquiryinfo;
        this.inquirydate = inquirydate;
    }


    public int getInquiryid() {
        return inquiryid;
    }

    public void setInquiryid(int inquiryid) {
        this.inquiryid = inquiryid;
    }

    public String getInquiryinfo() {
        return inquiryinfo;
    }

    public void setInquiryinfo(String inquiryinfo) {
        this.inquiryinfo = inquiryinfo;
    }

    public Date getInquirydate() {
        return inquirydate;
    }

    public void setInquirydate(Date inquirydate) {
        this.inquirydate = inquirydate;
    }


    public void createInquiry() {

        System.out.println("New inquiry created: " + this.inquiryinfo);
    }


    public static void reviewInquiry() {

        System.out.println("Reviewing inquiries");
 
    }

} 