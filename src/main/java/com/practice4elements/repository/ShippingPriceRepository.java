package com.practice4elements.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.practice4elements.entity.ShippingPrice;

@Repository
public interface ShippingPriceRepository extends JpaRepository<ShippingPrice, Long>
{
    @Modifying
    @Query(value = "select s.price from shippingprice s where s.country = ?1 and s.weight >= ?2", nativeQuery = true)
    List<Float> findByCountryAndWeight(String country, int weight);
}
