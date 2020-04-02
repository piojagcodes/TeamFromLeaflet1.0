package com.TeamFromLeaflet10.TeamFromLeaflet10;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class DistrictCOntroller {
    @Autowired
    private DistrictService districtService;

    @GetMapping("/districts")
    public List<District> allDistricts() {

        return districtService.findAll();
    }

    @GetMapping("/districts/{Id}")
  public District findyById(@PathVariable(value = "id") Long id) {
        return districtService.findById(id);
    }

    @DeleteMapping("/districts/{Id}")
    public  void deleteById(@PathVariable(value = "id") Long id) {
        districtService.delete(id);

    }






    @PostMapping("/districts")
    public void add(@RequestBody District district) {
        districtService.create(district);
    }
}






