package com.example.my_coffee_shop_back_end.coffee;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CoffeeService {
    
    private final CoffeeRepository repository;
    
    public void saveCoffee(CoffeeModel coffeeModel) {
        validateCoffee(coffeeModel);
        repository.save(coffeeModel);
    }
     
        private void validateCoffee(CoffeeModel coffeeModel) {
        if (repository.existsById(coffeeModel.getId())) {
            throw new CoffeeExistsException("Coffee already exists with ID: " + coffeeModel.getId());
        }

        if (repository.existsByName(coffeeModel.getName())) {
            throw new CoffeeExistsException("Coffee already exists with the name: " + coffeeModel.getName());
        }
    }



}
