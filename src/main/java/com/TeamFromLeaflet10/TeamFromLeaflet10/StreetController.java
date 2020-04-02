package com.TeamFromLeaflet10.TeamFromLeaflet10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StreetController {
    @Autowired
    private StreetService streetService;
}
