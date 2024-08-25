package com.example.my_coffee_shop_back_end.coffee;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CoffeeService {
    
    private final CoffeeRepository repository;

    public void saveCoffee (CoffeeModel coffeeModel)
    {
        if (repository.existsById(coffeeModel.getId()) ) {
            throw new CoffeeExistsException("Coffee exists with ID :"+coffeeModel.getId());
        }else if(repository.existsByName(coffeeModel.getName()))
        {
            this.repository.save(coffeeModel);
        }

    }





}
