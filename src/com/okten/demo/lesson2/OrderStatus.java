package com.okten.demo.lesson2;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum OrderStatus {

    ACTIVE("в процесі"),
    PAYED("оплачено"),
    DELIVERED("доставлено");

    private final String userFriendlyName;

    public void printUserFriendly() {
        System.out.println("Статус замовлення: " + userFriendlyName);
    }

    public static OrderStatus findByFriendlyName(String value) {
        for (OrderStatus orderStatus : values()) {
            if (orderStatus.userFriendlyName.equals(value)) {
                return orderStatus;
            }
        }

        return null;
    }
}
