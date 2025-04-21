package com.ironhack.__ABR.models;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.math.BigDecimal;

@Entity
@DiscriminatorValue("SPICY")
public class SpicyBurger extends Burger {
    @Column(name = "spicy_level")
    private String spicyLevel;

    public SpicyBurger() {
    }

    public SpicyBurger(String name, BigDecimal price, String spicyLevel) {
        super(name, price);
        this.spicyLevel = spicyLevel;
    }

    public String getSpicyLevel() {
        return spicyLevel;
    }

    public void setSpicyLevel(String spicyLevel) {
        this.spicyLevel = spicyLevel;
    }

    @Override
    public String toString() {
        return super.toString() +
                "spicyLevel='" + spicyLevel + '\'' +
                '}';
    }
}
