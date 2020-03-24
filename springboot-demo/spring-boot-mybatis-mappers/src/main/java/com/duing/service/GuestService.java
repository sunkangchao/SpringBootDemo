package com.duing.service;

import com.duing.bean.Guest;
import com.duing.mapper.GuestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestService {

    @Autowired
    private GuestMapper guestMapper;  //报一点错就报一点错吧，没事儿。

    public List<Guest> find(){
        return guestMapper.find();
    }
}
