package com.shop.ChandraAndCompany.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Entity
@Data
@NoArgsConstructor
public class Bill
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int productId;
    private int sellPrice;
    private int quantity;
    private int totalAmount;
    private String productName;
    private String datetime;

   public Bill(int productId,int quantity,int sellPrice,String productName)
    {
        this.setProductId(productId);
        this.setQuantity(quantity);
        this.setSellPrice(sellPrice);
        this.setTotalAmount(quantity * sellPrice);
        this.setProductName(productName);
        this.datetime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
    }
}
