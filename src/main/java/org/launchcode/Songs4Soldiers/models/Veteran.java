package org.launchcode.Songs4Soldiers.models;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.Objects;

@Entity
public class Veteran {

    @Id
    @GeneratedValue
    private int userID;

    @NotBlank(message = "Name is required")
    @Size(min = 5, message = "Please use your full name.")
    private String vet_name;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email. Try again.")
    private String vet_email;

    // @Pattern([0-9]{3}-[0-9]{3}-[0-9]{4})
    @Size(max = 12, message = "Too many digits! format: 000-555-1234")
    private String vet_phone;

    private String branch;

    private Date vet_serviceStart;

    private Date vet_serviceEnd;

    @Size(max=500, message = "Description too long!")
    private String vet_help;

    public Veteran(int userID, String vet_name, String vet_email, String vet_phone, String branch, Date vet_serviceStart, Date vet_serviceEnd, String vet_help) {
        this.userID = userID;
        this.vet_name = vet_name;
        this.vet_email = vet_email;
        this.vet_phone = vet_phone;
        this.branch = branch;
        this.vet_serviceStart = vet_serviceStart;
        this.vet_serviceEnd = vet_serviceEnd;
        this.vet_help = vet_help;
    }

    public Veteran() {
    }

    public int getUserID() {
        return userID;
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

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
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

    @Override
    public String toString() {
        return "Veteran{" +
                "vet_name='" + vet_name + '\'' +
                ", vet_email='" + vet_email + '\'' +
                ", vet_phone='" + vet_phone + '\'' +
                ", vet_help='" + vet_help + '\'' +
                '}';
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Veteran veteran = (Veteran) o;
        return getUserID() == veteran.getUserID() && getVet_name().equals(veteran.getVet_name()) && getVet_email().equals(veteran.getVet_email()) && Objects.equals(getVet_phone(), veteran.getVet_phone());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserID(), getVet_name(), getVet_email());
    }
}


