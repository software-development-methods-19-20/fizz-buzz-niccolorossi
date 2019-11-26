package test;

import dssc.fizzbuzz.FizzBuzz;
import org.junit.jupiter.api.Test;

import java.util.HashMap;


import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class FizzBuzzTest {

    @Test
    void testNonMultiple() {
        HashMap<Integer, String> parameters = new HashMap<>();
        parameters.put(3, "Fizz");
        parameters.put(5, "Buzz");
        parameters.put(7, "Bang");
        FizzBuzz fizzBuzz = new FizzBuzz(parameters);

        assertThat(fizzBuzz.print(11), is("11"));
    }

    @Test
    void testMultipleThree() {
        HashMap<Integer, String> parameters = new HashMap<>();
        parameters.put(3, "Fizz");
        parameters.put(5, "Buzz");
        parameters.put(7, "Bang");
        FizzBuzz fizzBuzz = new FizzBuzz(parameters);

        assertThat(fizzBuzz.print(9), is("Fizz"));
    }

    @Test
    void testMultipleFive() {
        HashMap<Integer, String> parameters = new HashMap<>();
        parameters.put(3, "Fizz");
        parameters.put(5, "Buzz");
        parameters.put(7, "Bang");
        FizzBuzz fizzBuzz = new FizzBuzz(parameters);

        assertThat(fizzBuzz.print(10), is("Buzz"));
    }

    @Test
    void testMultipleThreeFive() {
        HashMap<Integer, String> parameters = new HashMap<>();
        parameters.put(3, "Fizz");
        parameters.put(5, "Buzz");
        parameters.put(7, "Bang");
        FizzBuzz fizzBuzz = new FizzBuzz(parameters);

        assertThat(fizzBuzz.print(15), is("FizzBuzz"));
    }

    @Test
    void testMultipleSeven() {
        HashMap<Integer, String> parameters = new HashMap<>();
        parameters.put(3, "Fizz");
        parameters.put(5, "Buzz");
        parameters.put(7, "Bang");
        FizzBuzz fizzBuzz = new FizzBuzz(parameters);

        assertThat(fizzBuzz.print(14), is("Bang"));
    }

    @Test
    void testMultipleThreeSeven() {
        HashMap<Integer, String> parameters = new HashMap<>();
        parameters.put(3, "Fizz");
        parameters.put(5, "Buzz");
        parameters.put(7, "Bang");
        FizzBuzz fizzBuzz = new FizzBuzz(parameters);

        assertThat(fizzBuzz.print(21), is("FizzBang"));
    }

    @Test
    void testMultipleFiveSeven() {
        HashMap<Integer, String> parameters = new HashMap<>();
        parameters.put(3, "Fizz");
        parameters.put(5, "Buzz");
        parameters.put(7, "Bang");
        FizzBuzz fizzBuzz = new FizzBuzz(parameters);

        assertThat(fizzBuzz.print(35), is("BuzzBang"));
    }

    @Test
    void testMultipleAll() {
        HashMap<Integer, String> parameters = new HashMap<>();
        parameters.put(3, "Fizz");
        parameters.put(5, "Buzz");
        parameters.put(7, "Bang");
        FizzBuzz fizzBuzz = new FizzBuzz(parameters);

        assertThat(fizzBuzz.print(105), is("FizzBuzzBang"));
    }

}