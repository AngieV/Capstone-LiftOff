package org.launchcode.Songs4Soldiers.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class User {

    private final String userType;

    @NotBlank
    private String name;

    @NotBlank
    @Email
    private String email;

//    @Pattern([0-9]{3}-[0-9]{3}-[0-9]{4})
    private String phone;


    private String help;

    public User(String userType, String name, String email, String phone, String help) {
        this.userType = userType;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.help = help;
    }

    public String getUserType() {
        return userType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getHelp() {
        return help;
    }

    public void setHelp(String help) {
        this.help = help;
    }

}
