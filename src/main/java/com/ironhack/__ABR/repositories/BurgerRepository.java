package com.ironhack.__ABR.repositories;

import com.ironhack.__ABR.models.Burger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BurgerRepository extends JpaRepository<Burger, Integer> {
}
