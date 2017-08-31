package ru.asugrobov;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FizzBuzzTests {
    @Test
    public void FizzBuzz_IfNotDiv3AndDiv5_WriteNumber(){
        String result = FizzBuzz.CheckNumber(1);
        assertEquals(result, "1");
        result = FizzBuzz.CheckNumber(2);
        assertEquals(result, "2");
    }

    @Test
    public void FizzBuzz_IfDiv3_WriteFizz(){
        String result = FizzBuzz.CheckNumber(3);
        assertEquals(result, "Fizz");
        result = FizzBuzz.CheckNumber(6);
        assertEquals(result, "Fizz");
    }

    @Test
    public void FizzBuzz_IfDiv5_WriteBuzz(){
        String result = FizzBuzz.CheckNumber(5);
        assertEquals(result, "Buzz");
        result = FizzBuzz.CheckNumber(10);
        assertEquals(result, "Buzz");
    }

    @Test
    public void FizzBuzz_IfDiv3AndDiv5_WriteFizzBuzz(){
        String result = FizzBuzz.CheckNumber(15);
        assertEquals(result, "FizzBuzz");
    }
}
