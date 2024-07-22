package com.shop.ChandraAndCompany.Controller;

import com.shop.ChandraAndCompany.Model.Fridge;
import com.shop.ChandraAndCompany.Service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
public class CartController
{
    @Autowired
    CartService cartService;
    List<Integer> items=new ArrayList<>();
    List<Fridge> fridgeList=new ArrayList<>();
    @PostMapping("/addCart")
    public String addCart(@RequestParam ("productId") int productId, Model model,@RequestParam(value = "currentUrl", required = false) String currentUrl)
    {
        items.add(productId);
        return "redirect:"+currentUrl;
    }
    @GetMapping("/viewCart")
    public String viewCart(Model model)
    {
        Collections.sort(items);
        fridgeList= cartService.getbyId(items);
        model.addAttribute("cartItem",fridgeList);
        return "Cart";
    }
}
