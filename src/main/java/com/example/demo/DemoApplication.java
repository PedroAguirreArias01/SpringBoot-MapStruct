package com.example.demo;

import com.example.demo.models.dto.CarDTO;
import com.example.demo.models.entity.Car;
import com.example.demo.models.entity.CarType;
import com.example.demo.models.mapper.CarMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        Car car = new Car("Morris", 5L, CarType.SEDAN);
        CarDTO carDto = CarMapper.INSTANCE.carToCarDto(car);
        System.out.println(carDto.toString());
    }
}
