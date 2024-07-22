package com.shop.ChandraAndCompany.DAO;

import com.shop.ChandraAndCompany.Model.All_Items;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface All_Items_DAO extends JpaRepository<All_Items,Integer>
{
}
