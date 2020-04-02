package com.TeamFromLeaflet10.TeamFromLeaflet10;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.plugin.com.DispatchImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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


    public District findById(Long id) {
        Optional<District> optionalDistrict = districtRepository.findById(id);
        District district = optionalDistrict.get();
        return district;
    }

    public void delete(Long id) {
        districtRepository.deleteById(id);
    }



    public void update(District district) {
        districtRepository.save(district);
    }
}
