package VowelCount;

public class Vowels {
    public static int getCount(String str) {
        int vowelsCount = 0;
        char vowels[] = {'a', 'e', 'i', 'o', 'u'};

        for (Character c:str.toCharArray()) {
            for (Character vowel:vowels){
                if(vowel.equals(c))
                    vowelsCount++;
            }
        }
        return vowelsCount;
    }

}
