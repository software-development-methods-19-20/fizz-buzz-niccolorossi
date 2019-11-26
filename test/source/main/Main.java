package main;

import dssc.fizzbuzz.FizzBuzz;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<Integer, String> parameters = new HashMap<>();
        parameters.put(3, "Fizz");
        parameters.put(5, "Buzz");
        parameters.put(7, "Bang");

        FizzBuzz fizzBuzz = new FizzBuzz(parameters);

        fizzBuzz.printInRange(1,101);
    }
}
