package org.launchcode.Songs4Soldiers.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="S4S")
public class S4Scontroller {

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
}
