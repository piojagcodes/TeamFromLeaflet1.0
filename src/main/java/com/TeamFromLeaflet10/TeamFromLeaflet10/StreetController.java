package com.TeamFromLeaflet10.TeamFromLeaflet10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StreetController {
    @Autowired
    private StreetService streetService;

    @Autowired
    private DistrictService districtService;


    @PostMapping("/streets/{StreetId}/streets")
    public void add(@PathVariable(value = "StreetId") Long postId, @RequestBody Street street) {
        District district = districtService.findById(postId);
        street.setDistrict(district);
        streetService.create(street);

    }
}
