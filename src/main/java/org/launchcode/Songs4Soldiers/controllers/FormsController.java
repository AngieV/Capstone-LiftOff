package org.launchcode.Songs4Soldiers.controllers;

import org.launchcode.Songs4Soldiers.data.UserData;
import org.launchcode.Songs4Soldiers.models.Veteran;
import org.launchcode.Songs4Soldiers.models.Volunteer;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

public class FormsController {

    private static List<Volunteer> volunteer = new ArrayList<>();
    private static List<Veteran> veteran = new ArrayList<>();

    @GetMapping("contact")
    public String displayVetAssistForm(Model model){
        model.addAttribute("title", "Request Assistance");
        model.addAttribute("userType", "userType");
        model.addAttribute("vet_name", "vet_name");
        model.addAttribute("vet_email", "vet_email");
        model.addAttribute("vet_phone", "vet_phone");
        model.addAttribute("vet_serviceStart", "vet_serviceStart");
        model.addAttribute("vet_serviceEnd", "vet_serviceEnd");
        model.addAttribute("vet_help", "vet_help");
        return "S4S/contact";
    }

    @PostMapping("contact")
    public String processVetAssistForm(@ModelAttribute @Valid Veteran newVeteran,
                                       Errors errors, Model model){

        if(errors.hasErrors()) {
            model.addAttribute("title", "Contact Us");
            return "S4S/contact";
        }
        UserData.add(newVeteran);
        return "redirect: /S4S/contact";
    }

    @GetMapping("contact")
    public String displayVolunteerForm(Model model){
        model.addAttribute("userType", "userType");
        model.addAttribute("name", "name");
        model.addAttribute("email", "email");
        model.addAttribute("phone", "phone");
        model.addAttribute("help", "help");
        return "S4S/contact";
    }

    @PostMapping("contact")
    public String createVolunteer(@ModelAttribute @Valid Volunteer newVolunteer,
                                  Errors errors, Model model){
        if(errors.hasErrors()) {
            model.addAttribute("title", "Contact Us");
            return "S4S/contact";
        }
        UserData.add(newVolunteer);
        return "redirect: /S4S/contact";
    }

    @GetMapping("create_account")
    public String displayCreateAccountForm(Model model){
        model.addAttribute("title", "Create Account");
        model.addAttribute("username", "username");
        model.addAttribute("pwHash", "pwHash");
        return "S4S/create_account";
    }

    @PostMapping("create_account")
    public String createAccount(@RequestParam String username,
                                @RequestParam String pwHash){
        return "redirect: /S4S/home";
    }
}
