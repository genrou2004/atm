package com.atm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by student on 6/26/17.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute(new User());
        return "home";
    }

    @RequestMapping(value = "/home", method = RequestMethod.POST)
    public String processLogin(@ModelAttribute Model model) {
        model.addAttribute(new User());
        return "redirect:/login";
    }


    @RequestMapping("/login")
    public String login(Model model) {
        model.addAttribute(new User());
        return "login";
    }

}
