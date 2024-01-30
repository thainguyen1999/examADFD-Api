package com.example.examadfd.service;

import com.example.examadfd.entity.PlaceEntity;

import java.util.List;

public interface PlaceService {
    void savePlace(PlaceEntity place);
    List<PlaceEntity> getAllPlace();
}
