package com.TeamFromLeaflet10.TeamFromLeaflet10;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dzielnice {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long ID;
    private String name;
    private float powierzchnia;
    private int Liczba_Ludnosci;
}
