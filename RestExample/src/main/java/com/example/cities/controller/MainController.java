package com.example.cities.controller;

import domain.City;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MainController {
    private static Map<String, City> cityRepo = new HashMap<>();

    static {
        City tallinn = new City();
        tallinn.setCityName("Tallinn");
        tallinn.setCountryName("Estonia");
        tallinn.setArea(159);
        tallinn.setLanguage("estonian");
        cityRepo.put(tallinn.getCityName(), tallinn);

        City moscow = new City();
        moscow.setCityName("Moscow");
        moscow.setCountryName("Russia");
        moscow.setArea(2511);
        moscow.setLanguage("russian");
        cityRepo.put(moscow.getCityName(), moscow);
    }

    @GetMapping("/")
    public ResponseEntity<Object> getCity() {
        return new ResponseEntity<>(cityRepo.values(), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Object> createProduct(@RequestBody City city) {
        cityRepo.put(city.getCityName(), city);
        return new ResponseEntity<>("New city has been added", HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{name}")
    public ResponseEntity<Object> delete(@PathVariable String name) {
        cityRepo.remove(name);

        return new ResponseEntity<>("City has been deleted", HttpStatus.OK);
    }

    @PutMapping("/update/{name}")
    public ResponseEntity<Object> updateProduct(@PathVariable String name, @RequestBody City city) {
        cityRepo.remove(name);
        city.setCityName(name);
        cityRepo.put(name, city);

        return new ResponseEntity<>("Product is updated successfully", HttpStatus.OK);
    }
}
