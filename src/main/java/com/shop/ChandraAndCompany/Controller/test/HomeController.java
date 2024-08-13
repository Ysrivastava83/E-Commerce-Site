package com.shop.ChandraAndCompany.Controller.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController
{
    @GetMapping("/")
    public String allItems(Model m)
    {
            m.addAttribute("text","in home page with Theamleaf");
            return "Home";
    }

}
