package com.okten.homeworks.lesson1;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Car {


    private String model;
    private int power;
    private int volume;

    @ToString.Exclude
    private boolean turbo;
}
