package com.okten.demo.lesson4;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;

@Data
@AllArgsConstructor
public class Vegetable {

    private Integer id;

    private String name;

    @Override
    public int hashCode() { // 2 billions...
        return Objects.hash(id, name);
    }

    @Override
    public boolean equals(Object obj) {
        Vegetable vegetable = (Vegetable) obj;
        return id == vegetable.id;
    }

    // vegetable1 => id = 5, name = qwe123
    // vegetable2 => id = 98423794, name = 203954092392340
    // vegetable1 != vegetable2, vegetable1.hashCode() == vegetable2.hashCode()
}
