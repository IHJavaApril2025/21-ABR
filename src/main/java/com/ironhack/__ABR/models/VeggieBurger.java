package com.ironhack.__ABR.models;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.math.BigDecimal;

@Entity
@DiscriminatorValue("VEGGIE")
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
