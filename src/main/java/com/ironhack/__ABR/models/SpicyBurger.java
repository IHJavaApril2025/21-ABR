package com.ironhack.__ABR.models;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "spicy_burger") // indicamos la tabla de la base de datos
@PrimaryKeyJoinColumn(name = "burger_id")
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
