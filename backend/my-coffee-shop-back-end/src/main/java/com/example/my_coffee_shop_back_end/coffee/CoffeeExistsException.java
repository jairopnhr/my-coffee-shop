package com.example.my_coffee_shop_back_end.coffee;

public class CoffeeExistsException extends RuntimeException{

    public CoffeeExistsException(String msg)
    {
        super(msg);
    }
}
