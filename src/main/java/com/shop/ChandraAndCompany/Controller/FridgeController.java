package com.shop.ChandraAndCompany.Controller;

import com.shop.ChandraAndCompany.Model.Fridge;
import com.shop.ChandraAndCompany.Service.FridgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/fridge")
public class FridgeController
{
    @Autowired
    FridgeService fridgeService;
    List<Fridge> listfridge;
    List<Fridge> listdc;
    List<Fridge> listff;
    Optional<Fridge> fridgeByModel;
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

        @GetMapping("/byModel")
        public String getByModel(Model model,@RequestParam int modelNum)
        {
            fridgeByModel=fridgeService.getByModel(modelNum);
            model.addAttribute("byModelNum",fridgeByModel);
            System.out.println(fridgeByModel);
            return "/Fridge/Fridge_byModel";
        }

        @GetMapping("/AddNewFridge")
        public String addNewFridge()
        {
            return "/Fridge/AddNewFridge";
        }


        @PostMapping("/AddNewFridgeDetails")
        public String addNewFridgeDetails(Model model,@ModelAttribute Fridge fridge)
        {
            fridgeService.addNewFridgeDetails(fridge);
            return "/Fridge/Fridge_Message";
        }

        @GetMapping("/EditFridge")
        public String editFridge(Model model)
        {
            List<Fridge> fridge=fridgeService.getall();
            //System.out.println(fridge);
            model.addAttribute("fridge",fridge);
            return "/Fridge/Fridge_EditShowAll";
        }

        @RequestMapping("/deleteFridge")
        public String deleteFridge(@RequestParam int productId)
        {
            //System.out.println(productId);
            fridgeService.delete(productId);
            return "redirect:" + "http://localhost:8080/fridge/EditFridge";
        }

        @RequestMapping("/EditFridgeById")
        public String editFridgeById(@RequestParam int productId,Model model)
        {
            Optional<Fridge> optionalFridge=fridgeService.getByModel(productId);
            Fridge fridge = optionalFridge.orElse(new Fridge());
            System.out.println(fridge);
            model.addAttribute("fridge",fridge);
            return  "/Fridge/Fridge_Edit";
        }

        @RequestMapping("/UpdateFridge")
        public String updateValues(@ModelAttribute Fridge fridge)
        {
            System.out.println(fridge);
            fridgeService.updateValue(fridge);
            return "/Fridge/Fridge_Message";
        }
}
