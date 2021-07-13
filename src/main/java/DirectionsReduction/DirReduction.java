package DirectionsReduction;

import java.util.*;

/* https://www.codewars.com/kata/550f22f4d758534c1100025a */

public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        int current;
        int successor;

        map.put("NORTH", 1);
        map.put("EAST", 2);
        map.put("SOUTH", 3);
        map.put("WEST", 4);

        for (int i=0; i < list.size() -1; i++){
            current = map.get(list.get(i));
            successor = map.get(list.get(i + 1));

            // reduce because opposite directions
            if ((current + successor) % 2 == 0 && current != successor){
                list.remove(i+1);
                list.remove(i);
                i = -1;
            }
        }
        return list.toArray(new String[0]);
    }
}
