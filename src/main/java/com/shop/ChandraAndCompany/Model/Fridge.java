package com.shop.ChandraAndCompany.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity@Data
public class Fridge
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
    private String brand;
    private String type;
    private String model;
    private String modelDesc;
    private String color;
    private int capacity;
    private int starRating;
    private int mrp;
    private int mop;
    private int dp;
    private int quantity;
    private int margin;
    private double marginPer;

}
