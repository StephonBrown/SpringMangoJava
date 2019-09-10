/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stephb.JavaMongo.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

/**
 *
 * @author stephon
 */
@Getter @Setter
public class Customer {

    private @Id String id;
    private String emailAddress;
    private String firstName;
    private String lastName;
    private String address;
    
}
