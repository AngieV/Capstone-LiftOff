package org.launchcode.Songs4Soldiers.controllers;

import org.launchcode.Songs4Soldiers.models.Volunteer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value="S4S")
public class S4Scontroller {


    private static List<Volunteer> volunteer = new ArrayList<>();

    @RequestMapping(value="index")
    public String index(Model model){
        model.addAttribute("title", "Songs4Soldiers");
        return "S4S/index";
    }

    @RequestMapping(value="about")
    public String about(Model model){
        model.addAttribute("title", "About Us");
        return "S4S/about";
    }

    @RequestMapping(value="events")
    public String events(Model model){
        model.addAttribute("title", "Events");
        return "S4S/events";
    }

    @RequestMapping(value="shop")
    public String shop(Model model){
        model.addAttribute("title", "Merchandise");
        return "S4S/shop";
    }

    @RequestMapping(value="contact")
    public String contact(Model model){
        model.addAttribute("title", "Contact Us");
        return "S4S/contact";
    }

    @GetMapping("contact")
    public String displayVolunteerForm(Model model){
        model.addAttribute("vol_name", "vol_name");
        model.addAttribute("vol_email", "vol_email");
        model.addAttribute("vol_phone", "vol_phone");
        model.addAttribute("vol_help", "vol_help");
        return "S4S/contact";
    }

    @PostMapping("contact")
    public String createVolunteer(@RequestParam String vol_name,
                                  @RequestParam String vol_email,
                                  @RequestParam String vol_phone,
                                  @RequestParam String vol_help){
        volunteer.add(new Volunteer(vol_name, vol_email,vol_phone, vol_help));
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

    @GetMapping("vet_assist")
    public String displayVetAssistForm(Model model){
        model.addAttribute("title", "Request Assistance");
        model.addAttribute("vet_name", "vet_name");
        model.addAttribute("vet_email", "vet_email");
        model.addAttribute("vet_phone", "vet_phone");
        model.addAttribute("vet_help", "vet_help");
        return "S4S/contact";
    }

    @PostMapping("vet_assist")
    public String processVetAssistForm(@RequestParam String vet_name,
                                       @RequestParam String vet_email,
                                       @RequestParam String vet_phone,
                                       @RequestParam String vet_help){


        return "redirect: /S4S/contact";
    }
}
