package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {

        if (number % 3 == 0 && number % 5 == 0) {
            return "fizz buzz";
        } else if (number % 5 == 0) {
            return "buzz";
        } else if (number % 3 == 0) {
            return "fizz";
        } else {
            return number.toString();
        }

    }

}



