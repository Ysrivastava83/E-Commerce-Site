package com.shop.ChandraAndCompany.DAO;

import com.shop.ChandraAndCompany.Model.Fridge;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FridgeDAO extends JpaRepository<Fridge,Integer>
{
    List<Fridge> findByBrand(String brand);

    @Query("SELECT f.quantity FROM Fridge f WHERE f.productId = :productId")
    int findQuantityById(int productId);
@Modifying
@Transactional
    @Query("UPDATE Fridge f SET f.quantity = :quantityUpdate WHERE f.productId = :productId")
    void updateQuantity(int quantityUpdate,int productId);
}
