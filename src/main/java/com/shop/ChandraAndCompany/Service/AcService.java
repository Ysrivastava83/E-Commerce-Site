package com.shop.ChandraAndCompany.Service;

import com.shop.ChandraAndCompany.DAO.AcDAO;
import com.shop.ChandraAndCompany.Model.Ac;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AcService
{
    @Autowired
    AcDAO acDAO;
    public List<Ac> getall()
    {
        return acDAO.findAll();
    }
}
