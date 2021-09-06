package org.launchcode.Songs4Soldiers.models;



public class Volunteer {

    private String vol_name;


    private String vol_email;


    private String vol_phone;


    private String vol_help;


    public Volunteer(String vol_name, String vol_email, String vol_phone, String vol_help) {
        this.vol_name = vol_name;
        this.vol_email = vol_email;
        this.vol_phone = vol_phone;
        this.vol_help = vol_help;
    }

    public String getVol_name() {
        return vol_name;
    }

    public void setVol_name(String vol_name) {
        this.vol_name = vol_name;
    }

    public String getVol_email() {
        return vol_email;
    }

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
