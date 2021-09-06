package org.launchcode.Songs4Soldiers.models;

public class UserAssist {


    private String vet_name;


    private String vet_email;


    private String vet_phone;


    private String vet_help;

    public UserAssist(String vet_name, String vet_email, String vet_phone, String vet_help) {
        this.vet_name = vet_name;
        this.vet_email = vet_email;
        this.vet_phone = vet_phone;
        this.vet_help = vet_help;
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

    public String getVet_help() {
        return vet_help;
    }

    public void setVet_help(String vet_help) {
        this.vet_help = vet_help;
    }
}
