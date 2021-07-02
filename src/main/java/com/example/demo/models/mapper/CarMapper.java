/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.models.mapper;

import com.example.demo.models.dto.CarDTO;
import com.example.demo.models.entity.Car;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;


/**
 *
 * @author Pedro
 */
@Mapper
public interface CarMapper {
    
    CarMapper INSTANCE = Mappers.getMapper( CarMapper.class ); 
    
    @Mapping(source = "numberOfSeats", target = "seatCount")
    CarDTO carToCarDto(Car car); 
}
