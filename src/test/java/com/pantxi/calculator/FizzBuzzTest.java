package com.pantxi.calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {

    @Test
    void testNombreNormal() {
        assertEquals("1", FizzBuzz.de(1));
        assertEquals("2", FizzBuzz.de(2));
    }

    @Test
    void testDivisiblePar3() {
        assertEquals("Fizz", FizzBuzz.de(3));
        assertEquals("Fizz", FizzBuzz.de(6));
    }

    @Test
    void testDivisiblePar5() {
        assertEquals("Buzz", FizzBuzz.de(5));
        assertEquals("Buzz", FizzBuzz.de(10));
    }

    @Test
    void testDivisiblePar3Et5() {
        assertEquals("FizzBuzz", FizzBuzz.de(15));
        assertEquals("FizzBuzz", FizzBuzz.de(30));
    }
}
