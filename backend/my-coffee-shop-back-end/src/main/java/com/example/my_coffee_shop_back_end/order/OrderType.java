package com.example.my_coffee_shop_back_end.order;

public enum OrderType {
    DINE_IN("Dine-In", 1),
    TAKE_OUT("Take-Out", 2),
    DELIVERY("Delivery", 3);

    private final String description;
    private final int code;

    OrderType(String description, int code) {
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

    public static OrderType fromCode(int code) {
        for (OrderType type : OrderType.values()) {
            if (type.getCode() == code) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid code: " + code);
    }

    public static OrderType fromDescription(String description) {
        for (OrderType type : OrderType.values()) {
            if (type.getDescription().equalsIgnoreCase(description)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid description: " + description);
    }
}