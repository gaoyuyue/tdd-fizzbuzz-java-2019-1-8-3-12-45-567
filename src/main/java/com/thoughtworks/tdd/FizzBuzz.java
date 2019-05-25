package com.thoughtworks.tdd;

public class FizzBuzz {
    public String fizzBuzz(int number) {
        if (number % 3 != 0 && number % 5 != 0 && number % 7 != 0) {
            return String.valueOf(number);
        }

        StringBuilder builder = new StringBuilder();
        if (number % 3 == 0) {
            builder.append("Fizz");
        }
        if (number % 5 == 0) {
            builder.append("Buzz");
        }
        if (number % 7 == 0) {
            builder.append("Whizz");
        }
        return builder.toString();
    }
}
