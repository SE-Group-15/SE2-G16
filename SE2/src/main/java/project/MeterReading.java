/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author Ahmed
 */
public class MeterReading {
     private int readingId;
    private float reading;
    private String meterStatus;

    // Constructor
    public MeterReading(int readingId, float reading, String meterStatus) {
        this.readingId = readingId;
        this.reading = reading;
        this.meterStatus = meterStatus;
    }

    // Setter and Getter for readingId
    public void setReadingId(int readingId) {
        this.readingId = readingId;
    }

    public int getReadingId() {
        return readingId;
    }

    // Setter and Getter for reading
    public void setReading(float reading) {
        this.reading = reading;
    }

    public float getReading() {
        return reading;
    }

    // Setter and Getter for meterStatus
    public void setMeterStatus(String meterStatus) {
        this.meterStatus = meterStatus;
    }

    public String getMeterStatus() {
        return meterStatus;
    }

    // Function to collect readings
    public void collectReadings(int readingId, float reading, String meterStatus) {
        this.readingId = readingId;
        this.reading = reading;
        this.meterStatus = meterStatus;
    }

    // Function to calculate consumption
    public void calculateConsumption() {

    }

    // Function to calculate cost
    public void calculateCost() {

    }

    // Function to check meter status
    public void meterStat() {

    }

    // Function to add discount and return bill_id
    public int addDiscount() {
        return 0; // Return bill_id
    }

    // Function to add additional charge and return bill_id
    public int additionalCharge() {
        return 0; // Return bill_id
    }

    // Function to calculate total consumption
    public void totalConsumption() {

    }
}