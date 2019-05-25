package com.thoughtworks.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzz;
    @BeforeEach
    public void before() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void should_return_number() {
        assertThat(fizzBuzz.fizzBuzz(1), is("1"));
    }

    @Test
    public void should_return_fizz_when_input_number_is_multiple_of_3() {
        assertThat(fizzBuzz.fizzBuzz(3), is("Fizz"));
    }

    @Test
    public void should_return_buzz_when_input_number_is_multiple_of_5() {
        assertThat(fizzBuzz.fizzBuzz(5), is("Buzz"));
    }

    @Test
    public void should_return_whizz_when_input_number_is_multiple_of_7() {
        assertThat(fizzBuzz.fizzBuzz(7), is("Whizz"));
    }

    @Test
    public void should_return_fizz_buzz_when_input_number_is_multiple_of_3_and_5() {
        assertThat(fizzBuzz.fizzBuzz(15), is("FizzBuzz"));
    }

    @Test
    public void should_return_fizz_buzz_whizz_when_input_number_is_multiple_of_3_and_5_and_7() {
        assertThat(fizzBuzz.fizzBuzz(105), is("FizzBuzzWhizz"));
    }
}
