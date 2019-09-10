/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stephb.JavaMongo.dao;

import com.stephb.JavaMongo.dto.Customer;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author stephon
 */
public interface CustomerDao extends MongoRepository<Customer, String>{
    @Override
    public List<Customer> findAll();
    public List<Customer> findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);
    @Override
    public Customer findById(String id);
}
