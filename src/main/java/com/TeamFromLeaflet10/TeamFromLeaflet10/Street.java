package com.TeamFromLeaflet10.TeamFromLeaflet10;

import javax.persistence.*;

@Entity
public class Street {

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Street{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public Street(String name, String type, District district) {
        this.name = name;
        this.type = type;
        this.district = district;
    }

    public District getDistrict() {

        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String name;
    private String type;

    @ManyToOne
    @JoinColumn
    private District district;


    private Street() {

    }

}
