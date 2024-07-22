package com.shop.ChandraAndCompany.DAO;

import com.shop.ChandraAndCompany.Model.Fridge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FridgeDAO extends JpaRepository<Fridge,Integer>
{
    List<Fridge> findByBrand(String brand);
}
