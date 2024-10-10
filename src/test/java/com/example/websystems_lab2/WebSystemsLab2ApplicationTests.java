package com.example.websystems_lab2;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class WebSystemsLab2ApplicationTests {

    @Test
    public void testProductCreation() {
        Product product = new Product("1", "Test Product");
        assertEquals("1", product.getId());
        assertEquals("Test Product", product.getName());
    }

}
