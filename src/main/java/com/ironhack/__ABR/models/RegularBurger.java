package com.ironhack.__ABR.models;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "regular_burger") // indicamos la tabla de la base de datos
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class RegularBurger extends Burger {

    public RegularBurger() {
    }

    public RegularBurger(String name, BigDecimal price) {
        super(name, price);
    }


}
