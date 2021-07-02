/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.models.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;



/**
 *
 * @author Pedro
 */
@Getter
@Setter
@AllArgsConstructor
public class Car {
    
    private String make;
    private Long numberOfSeats;
    private CarType type;
}
