package com.ironhack.__ABR.models;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "regular_burger") // indicamos la tabla de la base de datos
@PrimaryKeyJoinColumn(name = "burger_id")
public class RegularBurger extends Burger {
    private Boolean hasCheese;

    @Column(name = "meat_type")
    private String meatType;

    public RegularBurger() {
    }

    public RegularBurger(String name, BigDecimal price, Boolean hasCheese, String meatType) {
        super(name, price);
        this.hasCheese = hasCheese;
        this.meatType = meatType;
    }

    public Boolean getHasCheese() {
        return hasCheese;
    }

    public void setHasCheese(Boolean hasCheese) {
        this.hasCheese = hasCheese;
    }

    public String getMeatType() {
        return meatType;
    }

    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }

    @Override
    public String toString() {


        return super.toString() +
                "hasCheese=" + hasCheese +
                ", meatType='" + meatType + '\'' +
                '}';
    }
}
