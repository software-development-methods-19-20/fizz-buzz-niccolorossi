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
    void testMultipleThreeFive() {
        assertThat(FizzBuzz.print(15), is("FizzBuzz"));
    }

    @Test
    void testMultipleSeven() {
        assertThat(FizzBuzz.print(14), is("Bang"));
    }

    @Test
    void testMultipleThreeSeven() {
        assertThat(FizzBuzz.print(21), is("FizzBang"));
    }

    @Test
    void testMultipleFiveSeven() {
        assertThat(FizzBuzz.print(35), is("BuzzBang"));
    }

    @Test
    void testMultipleAll() {
        assertThat(FizzBuzz.print(105), is("FizzBuzzBang"));
    }

}