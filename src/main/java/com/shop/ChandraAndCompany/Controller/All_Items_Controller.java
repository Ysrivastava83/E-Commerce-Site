package com.shop.ChandraAndCompany.Controller;


import com.shop.ChandraAndCompany.Model.All_Items;
import com.shop.ChandraAndCompany.Service.All_Items_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class All_Items_Controller
{
    List<All_Items> items;

    static final String homeURL="http://localhost:8080/home";
    @Autowired
    All_Items_Service allItemsService;
    @GetMapping("/home")
    public String allItems(Model model)
    {
             items=allItemsService.allItems();
            model.addAttribute("items",items);
            return "All_Items";
    }
}
