package PersistentBugger;


import java.util.Arrays;

class Persist {

    public static int persistence(long n) {
        if (n < 9)
            return 0;

        String number = String.valueOf(n);
        String[] splittedValue = number.split("");

        int counter = 0;
        for (int i=0; i < splittedValue.length; i++) {
            counter++;
            i = 0;
            splittedValue = doTheRecursiveJob(splittedValue);
        }
        return counter;
    }

    public static String[] doTheRecursiveJob(String[] value) {
        String puffer;
        int multiplied = Integer.parseInt(value[0]);

        for (int i=0; i < value.length - 1; i++) {
            multiplied = multiplied * Integer.parseInt(value[i+1]);
        }
        puffer = String.valueOf(multiplied);
        return puffer.split("");
    }


    public static int theFancyWay(long n) {
        if (n < 10) return 0;

        final long newN = Arrays.stream(String.valueOf(n).split(""))
                .mapToLong(Long::valueOf)
                .reduce(1, (acc, next) -> acc * next);

        return theFancyWay(newN) + 1;
    }
}
