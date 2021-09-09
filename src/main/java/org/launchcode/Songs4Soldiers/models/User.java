package org.launchcode.Songs4Soldiers.models;

import javax.validation.constraints.*;

public class User {

    @NotBlank (message = "Name is required")
    private String name;

    @NotBlank(message = "Name is required")
    @Email
    @Size(min = 7, max = 55, message = "Email must be between 7 and 55 characters long")
    private String email;

    @Size(max = 12, message = "Too many digits! format: 000-555-1234")
    private String phone;

    @Size(max=500, message = "Description too long!")
    private String help;

    public User(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
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

}
