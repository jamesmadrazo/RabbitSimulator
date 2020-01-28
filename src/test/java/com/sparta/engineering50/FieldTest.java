package com.sparta.engineering50;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class FieldTest {
    private Field field = new Field();
    @Test
    void addRabbitToArrayList() {
        field.createRabbit();
        assertEquals(1,field.getRabbits().size());
    }
}
