package org.launchcode.Songs4Soldiers.data;

import org.launchcode.Songs4Soldiers.models.User;
import org.launchcode.Songs4Soldiers.models.Veteran;
import org.launchcode.Songs4Soldiers.models.Volunteer;

import java.util.HashMap;
import java.util.Map;

public class UserData {

    //need a place to store user data
    private static Map<String, Volunteer> volunteers = new HashMap<>();
    private static Map<String, Veteran> veterans = new HashMap<>();
    private static Map<String, User> users = new HashMap<>();

    //get user data by email
    public static Volunteer getVolByEmail(String vol_email) {
        return volunteers.get(vol_email);
    }

    public static Veteran getVetByEmail(String vet_email){
        return veterans.get(vet_email);
    }

    public static User getUserByEmail(String email){
        return users.get(email);
    }


    //add volunteers and vets
    public static void add(Volunteer volunteer){
        volunteers.put(volunteer.getVol_email(), volunteer);
    }

    public static void add(Veteran veteran){
        veterans.put(veteran.getVet_email(), veteran);
    }

    public static void add(User user){
        users.put(user.getEmail(), user);
    }

    //edit user info

    //verify user

    //reset password

    //get user purchase info

}
