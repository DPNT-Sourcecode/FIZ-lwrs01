package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {

        if ((number % 5 == 0 && number.toString().contains("5")) || (number % 3 == 0 && number.toString().contains("3"))) {
            if (number % 2 != 0) {
                return "fizz buzz fake deluxe";
            }
            return "fizz buzz deluxe";
        } else if ((number % 5 == 0 && number.toString().contains("5")) && (number > 10 && checkDigits(number))) {
            if (number % 2 != 0) {
                return "buzz fake deluxe";
            }
            return "buzz deluxe";
        } else if ((number % 3 == 0 && number.toString().contains("3")) && (number > 10 && checkDigits(number))) {
            if (number % 2 != 0) {
                return "fizz fake deluxe";
            }
            return "fizz deluxe";
        } else if ((number % 5 == 0 || number.toString().contains("5")) && (number % 3 == 0 || number.toString().contains("3"))) {
            return "fizz buzz";
        } else if (number % 5 == 0 || number.toString().contains("5")) {
            return "buzz";
        } else if (number % 3 == 0 || number.toString().contains("3")) {
            return "fizz";
        } else {
            return number.toString();
        }


    }

    public boolean checkDigits(int nr) {
        int digit = nr % 10;

        while (nr != 0) {
            int currentDigit = nr % 10;
            nr = nr / 10;

            if (digit != currentDigit) {
                return false;
            }
        }
        return true;
    }
}





