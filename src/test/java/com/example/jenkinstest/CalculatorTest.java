package com.example.jenkinstest;


import com.example.jenkinstest.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void testSum() {
            assertEquals(9, calculator.sum(6, 3));
        }
    }