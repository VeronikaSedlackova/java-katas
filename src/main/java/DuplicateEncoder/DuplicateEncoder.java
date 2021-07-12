package DuplicateEncoder;

import java.util.HashMap;
import java.util.Locale;

public class DuplicateEncoder {
    static String encode(String word){
        HashMap<Character, Integer> map = new HashMap<>();
        String result = "";

        // count number of digits
        for (Character c:word.toLowerCase(Locale.ROOT).toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            }
            else
                map.put(c, 1);
        }

        // change string to desired format
        for (Character c: word.toLowerCase(Locale.ROOT).toCharArray()){
            if (map.get(c) == 1){
                result += "(";
            }
            else
                result += ")";
        }
        return result;
    }


//    Another solution:

//    static String encode(String word){
//        word = word.toLowerCase();
//        String result = "";
//        for (int i = 0; i < word.length(); ++i) {
//            char c = word.charAt(i);
//            result += word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")";
//        }
//        return result;
//    }
}
