package org.launchcode.Songs4Soldiers.Controllers;

/*
©Angela Volluz 2021
*/

import org.launchcode.Songs4Soldiers.models.Veteran;
import org.launchcode.Songs4Soldiers.models.Volunteer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value="S4S")
public class S4SController {

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

    @RequestMapping(value="registered")
    public String showRegistration( Model model) {
        model.addAttribute("title", "Registration");
        return "S4S/registered";
    }

    @RequestMapping(value="purchases")
    public String showPurchases(Model model) {
        model.addAttribute("title", "Your Cart");
        return "S4S/purchases";
    }

}
