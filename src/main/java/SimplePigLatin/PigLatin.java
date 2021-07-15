package SimplePigLatin;

public class PigLatin {
    public static String pigIt(String str) {

        int counter = 0;
        Character firstPosition;
        String ending = "ay";
        String[] list = str.split(" ");

        for (String current:list) {
            if (current.matches("^[a-zA-Z]*$")) {
                firstPosition = current.charAt(0);
                current = current.replaceFirst(firstPosition.toString(), "");
                current = current.concat(firstPosition + ending);
                list[counter] = current;
                counter++;
            }
        }
        return String.join(" ", list);
    }

/*
    ##################################################################################
    ("(\\w)(\\w*)") : Es gibt zwei Capture groups. Das erste Zeichen \w
    und die zweite Capture group mit \w* (alle Zeichen bis zum nächsten Leerzeichen).

    -> $2(=ig)$1(=P)ay, also “igPay”
    -> “replaceAll”: wendet Schema auf jedes Wort an
    #################################################################################

    import java.util.regex.Pattern;

    public class PigLatin {
        private static final Pattern regex = Pattern.compile("(\\w)(\\w*)");

        public static String pigIt(String str) {
            return regex.matcher(str).replaceAll("$2$1ay");
        }
    }
*/

}
