/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GSKK.model;

import java.io.Serializable;

/**
 *
 * @author kihoon
 */
public class Member implements Serializable {

    private String fullName;
    private String email;
    private String phone;
    private String programName;
    private int levelOfYear;
    
    public Member() {
        fullName = "";
        email =  "";
        phone =  "";
        programName =  "";
        levelOfYear = 0;
    }

    public Member(String fullName, String email, String phone, String programName, int levelOfYear) {
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.programName = programName;
        this.levelOfYear = levelOfYear;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public int getLevelOfYear() {
        return levelOfYear;
    }

    public void setLevelOfYear(int levelOfYear) {
        this.levelOfYear = levelOfYear;
    }
    

}
