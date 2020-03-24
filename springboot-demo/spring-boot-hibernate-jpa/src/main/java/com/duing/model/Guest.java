package com.duing.model;


import com.sun.javafx.beans.IDProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.io.Serializable;


@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Guest implements Serializable  {

    @javax.persistence.Id
    //发现加上了也好用。
    @Id
    private long id;

    @Column
    private String name;

    @Column
    private String role;

}
