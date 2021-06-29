package DigitalRoot;

public class DRoot {
    public static int digital_root(int n) {

        int reducedNumber = 0;
        int current;
        int remainingNumber = n;

        while (remainingNumber > 9) {
            current = remainingNumber;
            while (current % 10 == 0) {
                current = current / 10;
            }
            remainingNumber = current - current % 10;
            current = current % 10;
            reducedNumber += current;
        }

        if (reducedNumber > 9) {
            reducedNumber = digital_root(reducedNumber);
        } else
            return reducedNumber;

        return reducedNumber;
    }
}
