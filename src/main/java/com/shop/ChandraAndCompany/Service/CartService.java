package com.shop.ChandraAndCompany.Service;

import com.shop.ChandraAndCompany.DAO.FridgeDAO;
import com.shop.ChandraAndCompany.Model.Fridge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Indexed;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service
public class CartService
{
    @Autowired
    FridgeDAO fridgeDAO;
    public List<Fridge> getbyId(List<Integer> item)
    {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        List<Fridge> listfridge=new ArrayList<>();
        for (Integer i:item)
        {
            if(hashMap.containsKey(i))
            {
                hashMap.put(i,hashMap.get(i)+1);
            }
            else
                hashMap.put(i,1);
        }
        System.out.println(item);
        System.out.println(hashMap);
        listfridge=fridgeDAO.findAllById(item);

        for (Fridge fridge : listfridge) {
            Integer count = hashMap.get(fridge.getProductId());
            if (count != null) {
                fridge.setQuantity(count);
            }
        }
        return listfridge;

    }
}
