package ru.java.automation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DemoTest {
    @Test
    void firstTest() {
        Assertions.assertTrue(3 >= 2);
    }

    @Test
    void secondTest() {
        Assertions.assertTrue(3 >= 1);
    }
}
