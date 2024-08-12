package com.shop.ChandraAndCompany.Controller;

import com.shop.ChandraAndCompany.Service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.shop.ChandraAndCompany.Controller.All_Items_Controller.homeURL;

@Controller
public class GenerateBillController
{
    @Autowired
    BillService billService;
    @RequestMapping("/generateBill")
    public String generateBill(@RequestParam List<Integer> purchasingPrice,@RequestParam List<Integer> quantity,@RequestParam List<Integer> productId)
    {
        billService.saveBill(productId,purchasingPrice,quantity);
        return "redirect:"+homeURL;
    }

}
