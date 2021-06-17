/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdbms;

/**
 *
 * @author HP
 */
public class StudentBean {
    private int roll;
    private String name;
    private String branch;
    private String batch;
    private String gender;
    private String address;
    private String mobile;
    private java.sql.Date dob;
    
    public StudentBean(int roll,String name,String branch,String batch,String gender,String address,String mobile,java.sql.Date dob){
        this.roll  = roll;
        this.name = name;
        this.branch = branch;
        this.batch = batch;
        this.gender = gender;
        this.address = address;
        this.mobile = mobile;
        this.dob = dob;
        
    }

    /**
     * @return the roll
     */
    public int getRoll() {
        return roll;
    }

    /**
     * @param roll the roll to set
     */
    public void setRoll(int roll) {
        this.roll = roll;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the branch
     */
    public String getBranch() {
        return branch;
    }

    /**
     * @param branch the branch to set
     */
    public void setBranch(String branch) {
        this.branch = branch;
    }

    /**
     * @return the batch
     */
    public String getBatch() {
        return batch;
    }

    /**
     * @param batch the batch to set
     */
    public void setBatch(String batch) {
        this.batch = batch;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile the mobile to set
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * @return the dob
     */
    public java.sql.Date getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(java.sql.Date dob) {
        this.dob = dob;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
    
}
