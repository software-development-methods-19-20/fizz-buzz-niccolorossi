package test;

import dssc.fizzbuzz.FizzBuzz;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class FizzBuzzTest {

    @Test
    void testNonMultiple() {
        assertThat(FizzBuzz.print(11), is("11"));
    }

    @Test
    void testMultipleThree() {
        assertThat(FizzBuzz.print(9), is("Fizz"));
    }


    @Test
    void testMultipleFive() {
        assertThat(FizzBuzz.print(10), is("Buzz"));
    }

    @Test
    void testMultipleBoth() {
        assertThat(FizzBuzz.print(15), is("FizzBuzz"));
    }

}