package com.TeamFromLeaflet10.TeamFromLeaflet10;


import javax.persistence.*;
import java.util.Set;

@Entity
 public class District {

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "District{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", area=" + area +
                ", population=" + population +
                '}';
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long Id;
    private String name;
    private float area;
    private int population;

    @OneToMany(mappedBy = "district")
    private Set<Street> streets;


    private District() {

    }
}
