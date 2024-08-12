package com.shop.ChandraAndCompany.Service;

import com.shop.ChandraAndCompany.DAO.BillDAO;
import com.shop.ChandraAndCompany.Model.Bill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService
{
    @Autowired
    BillDAO billDAO;
    @Autowired
    FridgeService fridgeService;
    public List<Bill> displayAll()
    {
       return billDAO.findAll();
    }
    public void saveBill(List<Integer> productId, List<Integer> purchasingPrice, List<Integer> quantity)
    {
        for(int i=0;i< purchasingPrice.size();i++) {
            String productName = "";
            if (productId.get(i) / 1000 == 1) {
                productName = "Fridge";
                fridgeService.reduceQuantity(productId.get(i), quantity.get(i));
            }
            Bill bill = new Bill(productId.get(i), quantity.get(i), purchasingPrice.get(i), productName);
            billDAO.save(bill);

        }
    }

}
