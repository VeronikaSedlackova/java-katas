package CountingDuplicates;

import java.util.HashMap;
import java.util.Locale;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        HashMap<Character, Integer> duplicates = new HashMap<>();
        int counter = 0;

        for (Character c : text.toLowerCase(Locale.ROOT).toCharArray()) {
            if (duplicates.containsKey(c)) {
                if (duplicates.get(c) == 2) {
                    continue;
                } else {
                    duplicates.put(c, duplicates.get(c) + 1);
                    counter++;
                }
            } else {
                duplicates.put(c, 1);
            }
        }
        return counter;
    }
}
