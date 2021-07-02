/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.models.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



/**
 *
 * @author Pedro
 */
@Getter
@Setter
@ToString
public class CarDTO {
    
    private String make;
    private Long numberOfSeats;
    private String type;
}
