package com.hassan.app.hassanapp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NameService {

    @Autowired
    private NameRepository repository;

    public List<Name> getNames() {return repository.findAll();}





}
