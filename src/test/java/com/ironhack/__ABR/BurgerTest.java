package com.ironhack.__ABR;

import com.ironhack.__ABR.models.RegularBurger;
import com.ironhack.__ABR.models.SpicyBurger;
import com.ironhack.__ABR.models.VeggieBurger;
import com.ironhack.__ABR.repositories.BurgerRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
public class BurgerTest {
    @Autowired
    public BurgerRepository burgerRepository;

    @Test
    @DisplayName("Crea una burger regular")
    public void regularBurger() {
        BigDecimal price = new BigDecimal("8.99");

        RegularBurger regularBurger = new RegularBurger("Cheese burger", price);

        System.out.println("Regular burger: " + regularBurger);

        var newBurger = burgerRepository.save(regularBurger);

        assertNotNull(newBurger);

    }

    @Test
    @DisplayName("Crea una burger spicy")
    public void spicyBurger() {
        BigDecimal price = new BigDecimal("9.99");

        SpicyBurger spicyBurger = new SpicyBurger("Volcano", price, "Super high");

        System.out.println("Spicy burger: " + spicyBurger);

        var newBurger = burgerRepository.save(spicyBurger);

        assertNotNull(newBurger);

    }

    @Test
    @DisplayName("Crea una burger veggie")
    public void veggieBurger() {
        BigDecimal price = new BigDecimal("9.99");

        VeggieBurger veggieBurger = new VeggieBurger("Beans burger", price, "Beans");

        System.out.println("Spicy burger: " + veggieBurger);

        var newBurger = burgerRepository.save(veggieBurger);

        assertNotNull(newBurger);

    }


}
