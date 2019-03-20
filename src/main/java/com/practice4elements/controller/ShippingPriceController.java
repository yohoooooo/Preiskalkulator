package com.practice4elements.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.practice4elements.entity.ShippingPrice;
import com.practice4elements.service.ShippingPriceService;

@Controller
public class ShippingPriceController
{
    private ShippingPriceService service;


    public ShippingPriceController()
    {

    }


    @Autowired
    public ShippingPriceController(ShippingPriceService ser)
    {
        this.service = ser;
    }


    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public ModelAndView hello(HttpServletResponse response, @ModelAttribute ShippingPrice sp, BindingResult result) throws IOException
    {
        ModelAndView mv = new ModelAndView();
        float price = 0;

        if (result.hasErrors())
        {
            System.out.println(result.toString());
            return new ModelAndView("error");
        }
        if (sp.getPrice() != 0)
        {
            price = sp.getPrice();
        }
        mv.addObject("price", price);
        mv.setViewName("home");
        return mv;
    }


    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.POST)
    public ModelAndView hello(@ModelAttribute ShippingPrice sp, BindingResult result) throws IOException
    {
        if (result.hasErrors())
        {
            System.out.println(result.toString());
            System.out.println("MIIIIIIIIIIIIIIIII");
            return new ModelAndView("error");
        }
        ModelAndView mv = new ModelAndView();
        int w = float2Int(sp.getWeight());
        float price = service.getPriceByCountryAndWeight(sp.getCountry(), w);
        mv.addObject("price", price);
        mv.setViewName("home");
        return mv;
    }


    private int float2Int(float weight)
    {
        int result = (int) weight;
        if (result > weight)
        {
            return result + 1;
        }
        else
            return result;
    }
}
