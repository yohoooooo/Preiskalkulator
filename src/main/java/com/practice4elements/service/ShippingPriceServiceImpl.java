package com.practice4elements.service;

import java.util.Collections;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice4elements.repository.ShippingPriceRepository;

@Service
@Transactional
public class ShippingPriceServiceImpl implements ShippingPriceService
{

    private ShippingPriceRepository repository;


    public ShippingPriceServiceImpl()
    {

    }


    @Autowired
    public ShippingPriceServiceImpl(ShippingPriceRepository repository)
    {
        super();
        this.repository = repository;
    }


    @Override
    public float getPriceByCountryAndWeight(String country, int weight)
    {
        float price = 0;
        System.out.println("Everything alright.");
        List<Float> priceList = repository.findByCountryAndWeight(country, weight);
        if (!priceList.isEmpty())
        {
            Collections.sort(priceList);
            price = priceList.get(0);
        }
        return price;
    }
}
