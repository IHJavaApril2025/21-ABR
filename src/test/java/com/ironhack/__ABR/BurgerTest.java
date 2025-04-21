package com.ironhack.__ABR;

import com.ironhack.__ABR.models.RegularBurger;
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

        RegularBurger regularBurger = new RegularBurger("No cheese burger", price, false, "Beef");

        System.out.println("Regular burger: "+regularBurger);

        var newBurger = burgerRepository.save(regularBurger);

        assertNotNull(newBurger);

    }


}
