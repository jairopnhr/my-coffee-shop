package com.example.my_coffee_shop_back_end.user;

public enum Role {
    ADMIN(0,"ADMIN"),USER(1,"ADMIN"),EMPLOYEE(3,"EMPLOYEE");

    private String description;
    private int code;

    Role(int code, String description ) {
        this.description = description;
        this.code = code ;
    }
    public String  getDescription()
    {
        return this.description;
    }
    public int getCode()
    {
        return this.code;
    }
}
