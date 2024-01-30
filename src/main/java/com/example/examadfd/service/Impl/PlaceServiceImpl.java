package com.example.examadfd.service.Impl;

import com.example.examadfd.entity.PlaceEntity;
import com.example.examadfd.repository.PlaceRepository;
import com.example.examadfd.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PlaceServiceImpl implements PlaceService {
    @Autowired
    private PlaceRepository placeRepository;
    @Override
    public void savePlace(PlaceEntity place) {
        placeRepository.save(place);

    }

    @Override
    public List<PlaceEntity> getAllPlace() {
        return placeRepository.findAll();
    }
}
