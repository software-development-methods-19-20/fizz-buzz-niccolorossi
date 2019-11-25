package dssc.fizzbuzz;

public class FizzBuzz {


    public static String print(int number) {

        String toReturn = "";
        boolean isMultipleThree = number % 3 == 0;
        boolean isMultipleFive = number % 5 == 0;

        if(isMultipleThree) {
            toReturn += "Fizz";
        }
        if(isMultipleFive) {
            toReturn += "Buzz";
        }
        if(toReturn.isEmpty()) {
            toReturn = Integer.toString(number);
        }


        return toReturn;
    }
}
