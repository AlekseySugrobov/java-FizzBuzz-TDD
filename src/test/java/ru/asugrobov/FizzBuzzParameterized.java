package ru.asugrobov;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;

@RunWith(Parameterized.class)
public class FizzBuzzParameterized {
    private int number;
    private String expected;

    public FizzBuzzParameterized(int number, String expected){
        this.number = number;
        this.expected = expected;
    }

    @Parameterized.Parameters(name="{index}: FizzBuzz.CheckNumber({0}) = {1}")
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {1, "1"},
                {2, "2"},
                {3, "Fizz"},
                {4, "4"},
                {5, "Buzz"},
                {6, "Fizz"},
                {7, "7"},
                {8, "8"},
                {9, "Fizz"},
                {10, "Buzz"},
                {11, "11"},
                {12, "Fizz"},
                {13, "13"},
                {14, "14"},
                {15, "FizzBuzz"}
        });
    }

    @Test
    public void test_FizzBuzzCheckNumber(){
        Assert.assertThat(FizzBuzz.CheckNumber(number), is(expected));
    }
}
