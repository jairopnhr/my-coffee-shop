package com.example.my_coffee_shop_back_end.coffee;

public enum Size {
    SMALL(150,"SMALL",0) ,  MEDIUM(250,"MEDIUM",1),   BIG(450,"BIG",2);
    
    String name;
    int size;
    int code;


    Size(int size,String name, int code)
    {
        this.size = size;
        this.name = name;
        this.code = code;
    }


}
