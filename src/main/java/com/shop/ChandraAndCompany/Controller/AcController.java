package com.shop.ChandraAndCompany.Controller;

import com.shop.ChandraAndCompany.Model.Ac;
import com.shop.ChandraAndCompany.Model.Fridge;
import com.shop.ChandraAndCompany.Service.AcService;
import com.shop.ChandraAndCompany.Service.FridgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/ac")
public class AcController
{
    @Autowired
    AcService acService;
    List<Ac> listac;
    @GetMapping("/")
    public String acHome()
    {
        return "/AC/Ac_Home";
    }
    @GetMapping("/all")
    public String getall(Model model)
    {
        listac=acService.getall();
        model.addAttribute("listac",listac);
        return "/AC/All_Ac";
    }
}
