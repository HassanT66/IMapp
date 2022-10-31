package com.hassan.app.hassanapp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class NameController {

    @Autowired
    private NameService service;

    @GetMapping("/name")
    public List<Name> getNames(){
        return service.getNames();
    }

}
