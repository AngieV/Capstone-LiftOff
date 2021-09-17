package org.launchcode.Songs4Soldiers.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;


public class Volunteer {

    //@NotBlank(message = "Name is required")
    private String vol_name;

    //@NotBlank(message = "Email is required")
    //@Email(message = "Invalid email. Try again.")
    private String vol_email;

    // @Pattern([0-9]{3}-[0-9]{3}-[0-9]{4})
    //@Size(max = 12, message = "Too many digits! format: 000-555-1234")
    private String vol_phone;

    //@Size(max = 500, message = "Description too long!")
    private String vol_help;

    public Volunteer(String vol_name, String vol_email, String vol_phone, String vol_help) {
        this();
        this.vol_name = vol_name;
        this.vol_email = vol_email;
        this.vol_phone = vol_phone;
        this.vol_help = vol_help;
    }

    public Volunteer(){}

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

    @Override
    public String toString() {
        return "Volunteer{" +
                "vol_name='" + vol_name + '\'' +
                ", vol_email='" + vol_email + '\'' +
                ", vol_phone='" + vol_phone + '\'' +
                ", vol_help='" + vol_help + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Volunteer volunteer = (Volunteer) o;
        return getVol_name().equals(volunteer.getVol_name()) && getVol_email().equals(volunteer.getVol_email()) && getVol_phone().equals(volunteer.getVol_phone()) && getVol_help().equals(volunteer.getVol_help());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getVol_name(), getVol_email(), getVol_phone(), getVol_help());
    }
}
