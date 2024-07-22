package com.shop.ChandraAndCompany.Service;

import com.shop.ChandraAndCompany.DAO.FridgeDAO;
import com.shop.ChandraAndCompany.Model.Fridge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FridgeService {


    @Autowired
    FridgeDAO fridgeDAO;

    public List<Fridge> getall() {

        return fridgeDAO.findAll();
    }

    public List<Fridge> getByBrand(String brand) {
        return fridgeDAO.findByBrand(brand);
    }

    public List<Fridge> getByDCTYPE(List<Fridge> listfridge)
    {
        List<Fridge> listdc=new ArrayList<>();
        for (Fridge fridge:listfridge)
        {
            if (fridge.getType().equals("DC"))
                listdc.add(fridge);
        }
                    return listdc;
    }

    public List<Fridge> getByFFTYPE(List<Fridge> listfridge)
    {
        List<Fridge> listff=new ArrayList<>();
        for (Fridge fridge:listfridge)
        {
            if(fridge.getType().equals("FF"))
            listff.add(fridge);
        }
        return listff;
    }
}

