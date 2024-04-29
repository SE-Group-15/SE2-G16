/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.util.Date;

/**
 *
 * @author Ahmed
 */
public class Report {
    private int reportId;
    private String reportStatus;
    private Date reportDate;

    // Constructor
    public Report(int reportId, String reportStatus, Date reportDate) {
        this.reportId = reportId;
        this.reportStatus = reportStatus;
        this.reportDate = reportDate;
    }

    // Setter and Getter for reportId
    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    public int getReportId() {
        return reportId;
    }

    // Setter and Getter for reportStatus
    public void setReportStatus(String reportStatus) {
        this.reportStatus = reportStatus;
    }

    public String getReportStatus() {
        return reportStatus;
    }

    // Setter and Getter for reportDate
    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    public Date getReportDate() {
        return reportDate;
    }

    // Function to generate a general report
    public void generalReport() {
        // Your implementation here
    }
}
