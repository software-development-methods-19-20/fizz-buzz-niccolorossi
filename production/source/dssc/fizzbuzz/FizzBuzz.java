package dssc.fizzbuzz;

import java.util.HashMap;

public class FizzBuzz {

    private HashMap<Integer, String> parameters;

    public FizzBuzz(HashMap<Integer, String> parameters) {
        this.parameters = parameters;
    }

    public String print(int number) {

        String toReturn = "";

        for (Integer key : parameters.keySet()) {
            if(number % key == 0) {
                toReturn += parameters.get(key);
            }
        }

        if(toReturn.isEmpty()) {
            toReturn = Integer.toString(number);
        }

        return toReturn;
    }

    public void printInRange(int begin, int end) {
        for(int i=begin; i<end; i++) {
            System.out.println(print(i));
        }
    }
}
