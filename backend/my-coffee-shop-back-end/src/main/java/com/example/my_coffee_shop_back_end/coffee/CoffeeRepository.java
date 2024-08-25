package com.example.my_coffee_shop_back_end.coffee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoffeeRepository extends JpaRepository<CoffeeModel, Long> {
    boolean existsByName(String name);
}
