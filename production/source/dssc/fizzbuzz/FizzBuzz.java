package dssc.fizzbuzz;

public class FizzBuzz {


    public static String print(int number) {

        String toReturn = "";
        boolean isMultipleThree = number % 3 == 0;
        boolean isMultipleFive = number % 5 == 0;
        boolean isMultipleSeven = number % 7 == 0;

        if(isMultipleThree) {
            toReturn += "Fizz";
        }
        if(isMultipleFive) {
            toReturn += "Buzz";
        }
        if(isMultipleSeven) {
            toReturn += "Bang";
        }
        if(toReturn.isEmpty()) {
            toReturn = Integer.toString(number);
        }


        return toReturn;
    }

    public static void printInRange(int begin, int end) {
        for(int i=begin; i<end; i++) {
            System.out.println(print(i));
        }
    }
}
