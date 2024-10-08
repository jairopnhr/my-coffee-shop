package com.example.my_coffee_shop_back_end.coffee;

public enum CoffeeType {
    ARABICA("Arabica Coffee", 1),
    ROBUSTA("Robusta Coffee", 2),
    ESPRESSO("Espresso", 3),
    LATTE("Latte", 4),
    CAPPUCCINO("Cappuccino", 5),
    AMERICANO("Americano", 6),
    MOCHA("Mocha", 7),
    COLD_BREW("Cold Brew", 8),
    MACCHIATO("Macchiato", 9),
    FLAT_WHITE("Flat White", 10),
    RISTRETTO("Ristretto", 11);

    private final String description;
    private final int code;

    CoffeeType(String description, int code) {
        this.description = description;
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String toString() {
        return description;
    }

    public static CoffeeType fromCode(int code) {
        for (CoffeeType type : CoffeeType.values()) {
            if (type.getCode() == code) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid code: " + code);
    }

    public static CoffeeType fromDescription(String description) {
        for (CoffeeType type : CoffeeType.values()) {
            if (type.getDescription().equalsIgnoreCase(description)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid description: " + description);
    }
}
