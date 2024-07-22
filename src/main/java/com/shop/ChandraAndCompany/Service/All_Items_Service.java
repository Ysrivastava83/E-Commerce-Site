package com.shop.ChandraAndCompany.Service;

import com.shop.ChandraAndCompany.DAO.All_Items_DAO;
import com.shop.ChandraAndCompany.Model.All_Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class All_Items_Service
{
    @Autowired
    All_Items_DAO allItemsDao;
    public List<All_Items> allItems()
    {
       return allItemsDao.findAll();
    }
}
