/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author DELL
 */
public class UtilityCompany {
    private int companyId;
    private String companyName;
    private Bhistory bhistory;


    public UtilityCompany(int companyId, String companyName, Bhistory bhistory) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.bhistory = bhistory;
    }


    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Bhistory getBhistory() {
        return bhistory;
    }

    public void setBhistory(Bhistory bhistory) {
        this.bhistory = bhistory;
    }


    public void setTariff() {

        System.out.println("Tariff has been set for " + companyName);
    }


    public void updateTariff() {

        System.out.println("Tariff has been updated for " + companyName);
    }


}
