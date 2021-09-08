package org.launchcode.Songs4Soldiers.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Volunteer {

    private final String userType;

    @NotBlank(message = "Name is required")
    private String vol_name;

    @NotBlank(message = "Email is required")
    @Email
    @Size(min = 7, max = 55, message = "Email must be between 7 and 55 characters long")
    private String vol_email;

    // @Pattern([0-9]{3}-[0-9]{3}-[0-9]{4})
    @Size(max = 12, message = "Too many digits! format: 000-555-1234")
    private String vol_phone;

    @Size(max = 500, message = "Description too long!")
    private String vol_help;


    public Volunteer(String userType, String vol_name, String vol_email, String vol_phone, String vol_help) {
        this.userType = userType;
        this.vol_name = vol_name;
        this.vol_email = vol_email;
        this.vol_phone = vol_phone;
        this.vol_help = vol_help;
    }

    public String getUserType() {
        return userType;
    }

    public String getVol_name() {
        return vol_name;
    }

    public void setVol_name(String vol_name) {
        this.vol_name = vol_name;
    }

    public String getVol_email() { return vol_email; }

    public void setVol_email(String vol_email) {
        this.vol_email = vol_email;
    }

    public String getVol_phone() {
        return vol_phone;
    }

    public void setVol_phone(String vol_phone) {
        this.vol_phone = vol_phone;
    }

    public String getVol_help() {
        return vol_help;
    }

    public void setVol_help(String vol_help) {
        this.vol_help = vol_help;
    }
}
