package org.launchcode.Songs4Soldiers.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;

public class Veteran {

    private final String userType;

    @NotBlank(message = "Name is required")
    private String vet_name;

    @NotBlank(message = "Email is required")
    @Email
    @Size(min = 7, max = 55, message = "Email must be between 7 and 55 characters long")
    private String vet_email;

    // @Pattern([0-9]{3}-[0-9]{3}-[0-9]{4})
    @Size(max = 12, message = "Too many digits! format: 000-555-1234")
    private String vet_phone;

    private Date vet_serviceStart;

    private Date vet_serviceEnd;

    @Size(max=500, message = "Description too long!")
    private String vet_help;

    public Veteran(String userType, String vet_name, String vet_email, String vet_phone, Date vet_serviceStart, Date vet_serviceEnd, String vet_help) {
        this.userType = userType;
        this.vet_name = vet_name;
        this.vet_email = vet_email;
        this.vet_phone = vet_phone;
        this.vet_serviceStart = vet_serviceStart;
        this.vet_serviceEnd = vet_serviceEnd;
        this.vet_help = vet_help;
    }

    public String getUserType() {
        return userType;
    }

    public String getVet_name() {
        return vet_name;
    }

    public void setVet_name(String vet_name) {
        this.vet_name = vet_name;
    }

    public String getVet_email() {
        return vet_email;
    }

    public void setVet_email(String vet_email) {
        this.vet_email = vet_email;
    }

    public String getVet_phone() {
        return vet_phone;
    }

    public void setVet_phone(String vet_phone) {
        this.vet_phone = vet_phone;
    }

    public Date getVet_serviceStart() {
        return vet_serviceStart;
    }

    public void setVet_serviceStart(Date vet_serviceStart) {
        this.vet_serviceStart = vet_serviceStart;
    }

    public Date getVet_serviceEnd() {
        return vet_serviceEnd;
    }

    public void setVet_serviceEnd(Date vet_serviceEnd) {
        this.vet_serviceEnd = vet_serviceEnd;
    }

    public String getVet_help() {
        return vet_help;
    }

    public void setVet_help(String vet_help) {
        this.vet_help = vet_help;
    }

}
