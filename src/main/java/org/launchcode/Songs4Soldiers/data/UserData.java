package org.launchcode.Songs4Soldiers.data;

import org.launchcode.Songs4Soldiers.models.User;

import java.util.HashMap;
import java.util.Map;

public class UserData {

    //need a place to store user data
    private static Map<String, User> users = new HashMap<>();

    //get user data by email
    public static User getbyEmail(String email) {
        return users.get(email);
    }

    //add volunteers and vets
    public static void add(User user){
        users.put(user.getEmail(), user);
    }

    //edit user info

    // verify user

    //reset password

    //get user purchase info

}
