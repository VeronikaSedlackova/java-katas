package DisemvowelTrolls;

public class Troll {
    public static String disemvowel(String str) {
        return str.replaceAll("a|e|i|o|u|A|E|I|O|U", "");
    }
}
