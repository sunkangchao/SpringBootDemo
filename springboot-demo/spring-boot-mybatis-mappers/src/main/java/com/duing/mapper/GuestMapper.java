package com.duing.mapper;


import com.duing.bean.Guest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GuestMapper {

    List<Guest> find();
}
