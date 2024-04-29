/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author DELL
 */
public class Employee {

    private int employeeID;
    private double salary;
    private String shift;
    private Bill bill;

    public Employee(int employeeID, double salary, String shift, Bill bill) {
        this.employeeID = employeeID;
        this.salary = salary;
        this.shift = shift;
        this.bill = bill;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
}