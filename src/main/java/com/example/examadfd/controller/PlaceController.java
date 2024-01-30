package com.example.examadfd.controller;

import com.example.examadfd.entity.PlaceEntity;
import com.example.examadfd.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/getAllPlace")
public class PlaceController {
    @Autowired
    private PlaceService placeService;
    @GetMapping("/getAll")
    public List<PlaceEntity> getAllPlace() {
        List<PlaceEntity> placeEntities=new ArrayList<>();
        try{
            placeEntities=placeService.getAllPlace();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return placeEntities;
    }
}
