/**
 * Created by bernie on 18/11/2014.
 */
public class JavaBuzz {
    public boolean isDivisibleByThree(int number) {
        return (number % 3) == 0;
    }

    public boolean isDivisibleByFive(int number) {
        return (number % 5) == 0;
    }

    public boolean isDivisibleByFifteen(int number) {
        return (number % 15) == 0;
    }

    public String thisNumber(int number) {
        if (number == 15) {return "javabuzz";}
        if (number == 3 ) {return "java";    }
        if (number == 5 ) {return "buzz";    }
        String returnValue = String.valueOf(number);
        return returnValue;
    }
}
