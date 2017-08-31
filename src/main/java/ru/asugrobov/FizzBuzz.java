package ru.asugrobov;

public class FizzBuzz {
    public static String CheckNumber(int number) {
        String result = "";
        if(number % 3 == 0)
            result += "Fizz";
        if(number % 5 == 0)
            result += "Buzz";
        if(result.isEmpty())
            result += String.valueOf(number);
        return result;
    }
}
