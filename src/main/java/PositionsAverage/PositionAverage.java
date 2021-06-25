package PositionsAverage;


public class PositionAverage {
    public static double posAverage(String s) {
        double average = 0;
        double distance = hamiltonDistance(s);
        double allDigits = amountOfComparison(s);

        average = distance / (allDigits / 100);
        average = (double)Math.round(average * 10000000000d) / 10000000000d;

        return average;
    }

    public static int hamiltonDistance(String s) {
        int counter = 0;
        int counterSum = 0;

        for (int i = 0; i < s.length(); i++) {
            ++counter;
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(i) == ',' || s.charAt(i) == ' ') {
                    counter = 0;
                    break;
                } else if (s.charAt(j) == ',') {
                    if (s.charAt(i) == s.charAt(j + 1 + counter)) {
                        counterSum++;
                    }
                }
            }
        }

        return counterSum;
    }

    public static int amountOfNumbers(String s) {
        int counter = 1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ',')
                counter++;
        }
        return counter;

    }

    public static int amountOfComparison(String s) {
        int counter = 0;

        // count of digits
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ',' || s.charAt(i) == ' ')
                continue;
            else
                counter++;
        }

        int amount = amountOfNumbers(s);
        return (amount * (amount - 1) / 2) * (counter / amount);
    }

}
