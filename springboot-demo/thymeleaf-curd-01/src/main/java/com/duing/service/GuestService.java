package com.duing.service;

import com.duing.bean.Guest;
import com.duing.dao.GuestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestService {

    @Autowired
    private GuestDao guestDao;

    public List<Guest> list() {
        return guestDao.list();
    }

    public void add(Guest guest) {
        guestDao.add(guest);
    }

    public void update(Guest guest) {
        guestDao.update(guest);
    }

    public void delete(String name) {
        guestDao.delete(name);
    }
}
