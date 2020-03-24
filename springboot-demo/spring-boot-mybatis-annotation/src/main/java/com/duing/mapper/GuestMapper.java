package com.duing.mapper;

import com.duing.model.Guest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface GuestMapper {

    @Select("select * from guest")
    List<Guest> find();

}
