package org.launchcode.Songs4Soldiers.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.*;
import java.util.Objects;

@Entity
public class User {

    @Id
    @GeneratedValue
    private int userID;

    @NotBlank (message = "Name is required")
    private String name;

    @NotBlank(message = "Name is required")
    @Email(message = "Invalid email. Try again.")
    private String email;

    @Size(max = 12, message = "Too many digits! format: 000-555-1234")
    private String phone;

    public User(int userID, String name, String email, String phone) {
        this.userID= userID;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public int getUserID() {
        return userID;
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

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return getUserID() == user.getUserID() && getName().equals(user.getName()) && getEmail().equals(user.getEmail()) && Objects.equals(getPhone(), user.getPhone());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserID(), getName(), getEmail(), getPhone());
    }
}
