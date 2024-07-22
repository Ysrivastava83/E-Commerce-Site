package com.shop.ChandraAndCompany.Controller;

import com.shop.ChandraAndCompany.Model.Fridge;
import com.shop.ChandraAndCompany.Service.FridgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/fridge")
public class FridgeController
{
    @Autowired
    FridgeService fridgeService;
    List<Fridge> listfridge;
    List<Fridge> listdc;
    List<Fridge> listff;
    @GetMapping("/")
    public String fridgeHome()
    {
        return "/Fridge/Fridge_Home";
    }

    @GetMapping("/Whirlpool")
    public String fridgeWhirlpool(Model model)
    {
       listfridge=fridgeService.getByBrand("Whirlpool");
       listdc=fridgeService.getByDCTYPE(listfridge);
       listff=fridgeService.getByFFTYPE(listfridge);
       model.addAttribute("listdc",listdc);
       model.addAttribute("listff",listff);
       return "/Fridge/Fridge_byBrand";
    }

    @GetMapping("/LG")
    public String fridgeLG(Model model)
    {
        listfridge=fridgeService.getByBrand("LG");
        listdc=fridgeService.getByDCTYPE(listfridge);
        listff=fridgeService.getByFFTYPE(listfridge);
        model.addAttribute("listdc",listdc);
        model.addAttribute("listff",listff);
        return "/Fridge/Fridge_byBrand";
    }
    @GetMapping("/Voltas")
    public String fridgeVoltas(Model model)
    {
        listfridge=fridgeService.getByBrand("Voltas");
        listdc=fridgeService.getByDCTYPE(listfridge);
        listff=fridgeService.getByFFTYPE(listfridge);
        model.addAttribute("listdc",listdc);
        model.addAttribute("listff",listff);
        return "/Fridge/Fridge_byBrand";
    }
    @GetMapping("/Other")
    public String fridgeOther(Model model)
    {
        listfridge=fridgeService.getByBrand("Other");
        listdc=fridgeService.getByDCTYPE(listfridge);
        listff=fridgeService.getByFFTYPE(listfridge);
        model.addAttribute("listdc",listdc);
        model.addAttribute("listff",listff);
        return "/Fridge/Fridge_byBrand";
    }
    @GetMapping("/all")
    public String getall(Model model)
        {
           listfridge=fridgeService.getall();
           model.addAttribute("listfridge",listfridge);
            return "/Fridge/All_Fridge";
        }
}
