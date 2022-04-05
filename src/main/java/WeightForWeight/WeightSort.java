package WeightForWeight;

import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

import java.util.stream.Collectors;

public class WeightSort {

    public static String orderWeight(String strng) {
        String[] splittedWeights = strng.split(" ");
        int[] weights = new int[splittedWeights.length];
        MultiValuedMap<Integer, Integer> weightsMap = new ArrayListValuedHashMap<>();

        for (int i = 0; i < splittedWeights.length; i++) {
            for (int j = 0; j < splittedWeights[i].length(); j++) {
                weights[i] += Integer.parseInt(splittedWeights[i].substring(j, j+1));
            }
            weightsMap.put(Integer.parseInt(splittedWeights[i]), weights[i]);
        }

        return weightsMap.entries().stream()
                .sorted((k1, k2) -> +k1.getKey().toString().compareTo(k2.getKey().toString()))
                .sorted((k1, k2) -> +k1.getValue().compareTo(k2.getValue()))
                .map((entry) -> entry.getKey().toString())
                .collect(Collectors.joining(" "));
                // String ist eig eine CharSequence;
                // joining macht eine CharSequence draus
                // delimiter sagt wie die Zahlen im String dann voneinander getrennt werden sollen
    }
}
