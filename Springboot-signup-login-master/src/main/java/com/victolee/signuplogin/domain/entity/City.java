package com.victolee.signuplogin.domain.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "city")
@NoArgsConstructor
public class City {

    @Id
    @Column(name = "id")
    public Integer id;
    @Column(name = "name")
    public String name;
    @Column(name = "countrycode")
    public String countrycode;
    @Column(name = "district")
    public String district;
    @Column(name = "population")
    public Integer population;

}
