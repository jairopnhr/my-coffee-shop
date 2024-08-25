package com.example.my_coffee_shop_back_end.coffee;

public enum Size {
    SMALL(150, "SMALL", 0),
    MEDIUM(250, "MEDIUM", 1),
    BIG(450, "BIG", 2);

    private final String name;
    private final int size;
    private final int code;

    Size(int size, String name, int code) {
        this.size = size;
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String toString() {
        return name;
    }

    public static Size fromCode(int code) {
        for (Size size : Size.values()) {
            if (size.getCode() == code) {
                return size;
            }
        }
        throw new IllegalArgumentException("Invalid code: " + code);
    }
}