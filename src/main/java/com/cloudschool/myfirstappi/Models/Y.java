package com.cloudschool.myfirstappi.Models;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.lang.reflect.Type;

@Entity
public class Y {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer CNP;

    @NotNull
    private String name;
}
