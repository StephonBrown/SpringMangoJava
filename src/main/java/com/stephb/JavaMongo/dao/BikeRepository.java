/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stephb.JavaMongo.dao;

import com.stephb.JavaMongo.dto.Bike;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author stephon
 */
public interface BikeRepository extends MongoRepository<Bike,String>{
    public Bike findByModelNumber(String modelNumber);
    @Override
    public List<Bike> findAll();
    public List<Bike> findByColor(String color);
}
