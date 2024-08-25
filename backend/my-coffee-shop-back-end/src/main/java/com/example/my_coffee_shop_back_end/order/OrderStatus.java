package com.example.my_coffee_shop_back_end.order;

public enum OrderStatus {
    PENDING("Pending", 1),
    PROCESSING("Processing", 2),
    COMPLETED("Completed", 3),
    CANCELED("Canceled", 4);

    private final String description;
    private final int code;

    OrderStatus(String description, int code) {
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

    public static OrderStatus fromCode(int code) {
        for (OrderStatus status : OrderStatus.values()) {
            if (status.getCode() == code) {
                return status;
            }
        }
        throw new IllegalArgumentException("Invalid code: " + code);
    }

    public static OrderStatus fromDescription(String description) {
        for (OrderStatus status : OrderStatus.values()) {
            if (status.getDescription().equalsIgnoreCase(description)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Invalid description: " + description);
    }
}
