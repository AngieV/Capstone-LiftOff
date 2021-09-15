package org.launchcode.Songs4Soldiers.Controllers;

/*
©Angela Volluz 2021
*/

import org.launchcode.Songs4Soldiers.data.UserData;
import org.launchcode.Songs4Soldiers.models.Veteran;
import org.launchcode.Songs4Soldiers.models.Volunteer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping(value="/S4S")
public class FormsController {

    private static List<Veteran> veteran = new ArrayList<>();
    private static List<Volunteer> volunteer = new ArrayList<>();

    @GetMapping("/contact")
    public String displayVetAssistanceForm(Model model) {
        model.addAttribute("title_vet", "Apply for Assistance");
        model.addAttribute(new Veteran());
        List<String> branchList = Arrays.asList("US Army", "US Navy", "US Air Force", "US Marines", "US Coast Guard");
        model.addAttribute("branchList", branchList);
        return "S4S/contact";
    }

    @PostMapping("/contact")
    public String processVetAssistRequest(@ModelAttribute("veteran") @Valid Veteran veteran,
                                          Errors errors, Model model) {
        if (errors.hasErrors()) {
            model.addAttribute("title", "Contact Us");
            return "S4S/contact";
        }
        //System.out.println(veteran);
        UserData.add(veteran);
        return "redirect:registered";
    }

    @GetMapping("contact/vol")
    public String displayVolunteerForm(Model model){
        model.addAttribute("title_vol", "Volunteer");
        model.addAttribute(new Volunteer());
        //model.addAttribute("volunteer", volunteer);
        return "S4S/contact";
    }

    @PostMapping("/contact/vol")
    public String createVolunteer(@ModelAttribute("volunteer") Volunteer volunteer, Model model){
        //System.out.println(volunteer);
        UserData.add(volunteer);
        return "redirect:registered";
    }

    /*     @GetMapping("/purchases")
    public String displayPurchases(Model model){
        return "S4S/purchases";
    }

    @PostMapping("/contact")
    public String createVolunteer(@ModelAttribute @Valid Volunteer volunteer,
                                  Errors errors, Model model) {
        if (errors.hasErrors()) {
            model.addAttribute("title", "Contact Us");
            return "S4S/contact";
        }
        UserData.add(volunteer);
        return "redirect: /S4S/create_account";
    }*/
}
