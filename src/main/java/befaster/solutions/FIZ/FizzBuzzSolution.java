package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {

        if ((number % 5 == 0 || number.toString().contains("5")) && (number % 3 == 0 || number.toString().contains("3"))
                && (number > 10 && checkDigits(number))) {
            return "fizz buzz deluxe";
        } else if ((number % 5 == 0 || number.toString().contains("5")) && (number % 3 == 0 || number.toString().contains("3"))) {
            return "fizz buzz";
        } else if (number % 5 == 0 || number.toString().contains("5")) {
            return "buzz";
        } else if (number % 3 == 0 || number.toString().contains("3")) {
            return "fizz";
        } else if (number > 10 && checkDigits(number)) {
            return "deluxe";
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



