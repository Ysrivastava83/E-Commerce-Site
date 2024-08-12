package com.shop.ChandraAndCompany.Controller;

import com.shop.ChandraAndCompany.Model.Bill;
import com.shop.ChandraAndCompany.Service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BillController
{@Autowired
    BillService billService;
    List<Bill> bill;

    @GetMapping("/BillDetail")
    public String billDetails(Model model)
    {

       bill=billService.displayAll();
       model.addAttribute("bill",bill);
       return "Bills";
    }
}
