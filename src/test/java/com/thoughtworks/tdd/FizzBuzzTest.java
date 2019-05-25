package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzTest {
    @Test
    public void should_return_number() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.fizzBuzz(1), is("1"));
    }
}
