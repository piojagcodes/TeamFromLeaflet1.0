package com.TeamFromLeaflet10.TeamFromLeaflet10;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DistrictService {
    @Autowired
    private DistrictRepository districtRepository;

    public List<District> findAll() {

        Iterable<District> list = districtRepository.findAll();

        List<District> districts = new ArrayList<District>();

        list.forEach(e -> districts.add(e));
        return districts;
    }

    public void create(District district) {
        districtRepository.save(district);
    }
}
