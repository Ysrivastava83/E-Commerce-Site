package com.shop.ChandraAndCompany.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity@Data
public class Ac
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
    private String brand;
    private String type;
    private String typeSeries;
    private String model;
    private String model_desc;
     private double capacity;
     private int starRating;
     private int mrp;
     private int mop;
     private int dp;
     private int margin;
     private double marginPer;
}
