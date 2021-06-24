package Mumbling;

import java.util.Locale;

public class Accumul {
    public static String accum(String s) {
        int counter = 0;
        String result = "";

        for (Character digit:s.toCharArray()) {
            String addData = digit.toString().toUpperCase() + digit.toString().toLowerCase().repeat(counter) + "-";
            result = result.concat(addData);
            counter++;
        }
        return (String) result.subSequence(0, result.length() - 1);
    }

}
