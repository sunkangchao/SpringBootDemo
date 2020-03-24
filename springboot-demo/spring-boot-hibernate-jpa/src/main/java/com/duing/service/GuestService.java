package com.duing.service;

import com.duing.model.Guest;
import com.duing.repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestService {

    @Autowired
    GuestRepository repository;


    public List<Guest> find(){
        return repository.findAll();
    }

}
