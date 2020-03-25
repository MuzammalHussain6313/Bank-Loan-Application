
package BusinessLogicLayer;


import java.sql.Date;

public class Person {

    private String name;
    private String fatherName;
    private String CNIC;
    private java.sql.Date dateOfBirth;
    private String phoneNo;
    private String permanenetAddress;

    private String refranceName;
    private String refrancePhoneNumber;

    private String yearlyIncom;
    private String jobDetail;
    public Person()
    {

    }
    public Person(String name, String fatherName, String CNIC, java.sql.Date dateOfBirth, String phoneNo, String permanenetAddress, String refranceName, String refrancePhoneNumber, String yearlyIncom, String jobDetail) {
        this.name = name;
        this.fatherName = fatherName;
        this.CNIC = CNIC;
        this.dateOfBirth = dateOfBirth;
        this.phoneNo = phoneNo;
        this.permanenetAddress = permanenetAddress;
        this.refranceName = refranceName;
        this.refrancePhoneNumber = refrancePhoneNumber;
        this.yearlyIncom = yearlyIncom;
        this.jobDetail = jobDetail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public void setCNIC(String CNIC) {
        this.CNIC = CNIC;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setJobDetail(String jobDetail) {
        this.jobDetail = jobDetail;
    }

    public void setPermanenetAddress(String permanenetAddress) {
        this.permanenetAddress = permanenetAddress;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setRefranceName(String refranceName) {
        this.refranceName = refranceName;
    }

    public void setRefrancePhoneNumber(String refrancePhoneNumber) {
        this.refrancePhoneNumber = refrancePhoneNumber;
    }

    public void setYearlyIncom(String yearlyIncom) {
        this.yearlyIncom = yearlyIncom;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getCNIC() {
        return CNIC;
    }

    public java.sql.Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getPermanenetAddressaddress() {
        return permanenetAddress;
    }

    public String getRefranceName() {
        return refranceName;
    }

    public String getRefrancePhoneNumber() {
        return refrancePhoneNumber;
    }

    public String getYearlyIncom() {
        return yearlyIncom;
    }

    public String getJobDetail() {
        return jobDetail;
    }

}
