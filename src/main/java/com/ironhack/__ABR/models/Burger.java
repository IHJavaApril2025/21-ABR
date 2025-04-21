package com.ironhack.__ABR.models;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "burger")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
public abstract class Burger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "burger_id")
    private int id;

    private String name;
    private BigDecimal price;

    public Burger() {
    }

    public Burger(String name, BigDecimal price) {

        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price+ ", " ;
    }
}
