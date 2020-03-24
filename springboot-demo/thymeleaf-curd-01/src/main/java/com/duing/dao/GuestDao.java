package com.duing.dao;

import com.duing.bean.Guest;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class GuestDao {

    private static List<Guest> guestList = new ArrayList<>();

    static {
        guestList.add(new Guest(1,"黄晓明", "店长"));
        guestList.add(new Guest(2,"林述巍", "总厨"));
        guestList.add(new Guest(3,"杨紫", "前台"));
        guestList.add(new Guest(4,"张一山", "顾客"));
        guestList.add(new Guest(5,"古巨基", "服务"));
    }

    public List<Guest> list() {
        return guestList;
    }

    public void add(Guest guest) {
        guestList.add(guest);
    }

    public void update(Guest guest) {
        Guest target = search(guest.getName());
        target.setRole(guest.getRole());
    }

    public Guest search(String name) {
        for (Guest guest : guestList) {
            if (guest.getName().equals(name)) {
                return guest;
            }
        }
        return null;
    }

    public void delete(String name) {
        guestList.remove(search(name));
    }


}
