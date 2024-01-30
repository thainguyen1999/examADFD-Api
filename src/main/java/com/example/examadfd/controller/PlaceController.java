package com.example.examadfd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class PlaceController {
    @GetMapping("/getAllPlace")
    public List<String> getAllPlace() {
        // Trả về danh sách các địa điểm
        return Arrays.asList("Địa điểm 1", "Địa điểm 2", "Địa điểm 3");
    }
}
