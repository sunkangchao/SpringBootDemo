package com.duing.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data @NoArgsConstructor @AllArgsConstructor
public class Guest {

    private long id;

    private String name;

    private String role;

}
