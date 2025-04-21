package com.ironhack.__ABR.models;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "veggie_burger") // indicamos la tabla de la base de datos
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) // debemos indicar la estrategia que se está usando
public class VeggieBurger extends Burger {
    @Column(name = "veggie_type")
    private String veggieType;

    public VeggieBurger() {
    }

    public VeggieBurger(String name, BigDecimal price, String veggieType) {
        super(name, price);
        this.veggieType = veggieType;
    }

    public String getVeggieType() {
        return veggieType;
    }

    public void setVeggieType(String veggieType) {
        this.veggieType = veggieType;
    }

    @Override
    public String toString() {
        return super.toString() +
                "veggieType='" + veggieType + '\'' +
                '}';
    }
}
