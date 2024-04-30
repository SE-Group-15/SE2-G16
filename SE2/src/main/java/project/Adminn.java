/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class Adminn {
    private static Adminn instance;
    private ArrayList<Admin> admin;

    private Adminn() {
        admin = new ArrayList<>();
    }

    public static Adminn getInstance() {
        if (instance == null) {
            instance = new Adminn();
        }
        return instance;
    }
    
    
    public void Addtariff(double c1, double c2, double c3, double c4){
        admin.add(new Admin(c1,c2,c3,c4));
    }
    
        public void Updatetariff(double c1, double c2, double c3, double c4){
        for(Admin user : admin) {
                user.setC1(c1);
                user.setC2(c2);
                user.setC3(c3);
                user.setC4(c4);
            }
        }
    
    
    public double Getc1(){
    
    for (Admin user : admin) {
           return user.getC1();
        }
        return 0;
    }
    
        
    public double Getc2(){
    
    for (Admin user : admin) {
           return user.getC2();
        }
        return 0;
    }

        public double Getc3(){
    
    for (Admin user : admin) {
           return user.getC3();
        }
        return 0;
    }
        
    public double Getc4(){
    
    for (Admin user : admin) {
           return user.getC4();
        }
        return 0;
    }




}
