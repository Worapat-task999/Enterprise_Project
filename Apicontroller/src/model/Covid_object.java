/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Worapat
 */
public class Covid_object {
    private String id,Announce_date,Notified_date,Sex,Age,Nationality,Province_of_isolation,Risk,Province_of_onset,District_of_onset;

    public Covid_object(String id, String Announce_date, String Notified_date, String Sex, String Age, String Nationality,
            String Province_of_isolation, String Risk, String Province_of_onset, String District_of_onset) {
        this.id = id;
        this.Announce_date = Announce_date;
        this.Notified_date = Notified_date;
        this.Sex = Sex;
        this.Age = Age;
        this.Nationality = Nationality;
        this.Province_of_isolation = Province_of_isolation;
        this.Risk = Risk;
        this.Province_of_onset = Province_of_onset;
        this.District_of_onset = District_of_onset;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAnnounce_date() {
        return Announce_date;
    }

    public void setAnnounce_date(String Announce_date) {
        this.Announce_date = Announce_date;
    }

    public String getNotified_date() {
        return Notified_date;
    }

    public void setNotified_date(String Notified_date) {
        this.Notified_date = Notified_date;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    public String getProvince_of_isolation() {
        return Province_of_isolation;
    }

    public void setProvince_of_isolation(String Province_of_isolation) {
        this.Province_of_isolation = Province_of_isolation;
    }

    public String getRisk() {
        return Risk;
    }

    public void setRisk(String Risk) {
        this.Risk = Risk;
    }

    public String getProvince_of_onset() {
        return Province_of_onset;
    }

    public void setProvince_of_onset(String Province_of_onset) {
        this.Province_of_onset = Province_of_onset;
    }

    public String getDistrict_of_onset() {
        return District_of_onset;
    }

    public void setDistrict_of_onset(String District_of_onset) {
        this.District_of_onset = District_of_onset;
    }
    
}
