package com.TeamFromLeaflet10.TeamFromLeaflet10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class StreetService {
    @Autowired
    private StreetRepository streetRepository;



    public void create(Street street)
    {
        streetRepository.save(street);
    }








}
