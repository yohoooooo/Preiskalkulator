package com.practice4elements.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shippingprice")
public class ShippingPrice
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String country;
    private float price;
    private int weight;

    public long getId()
    {
        return id;
    }


    public void setId(long id)
    {
        this.id = id;
    }


    public String getCountry()
    {
        return country;
    }


    public void setCountry(String country)
    {
        this.country = country;
    }


    public float getPrice()
    {
        return price;
    }


    public void setPrice(float price)
    {
        this.price = price;
    }


    public int getWeight()
    {
        return weight;
    }


    public void setWeight(int weight)
    {
        this.weight = weight;
    }


    @Override
    public String toString()
    {
        return "ShippingPrice [id=" + id + ", country=" + country + ", price=" + price + ", weight=" + weight + "]";
    }
}
