package application;
import java.util.regex.Pattern;


public class Checker {
    public static boolean checkInput(String input, String regex) {
        // Ensure that the regex is not null or empty
        if (regex == null || regex.isEmpty()) {
            throw new IllegalArgumentException("Invalid regular expression");
        }

        // Use the Pattern class to compile the regex
        Pattern pattern = Pattern.compile(regex);

        // Use the matcher to check if the input matches the regex
        return pattern.matcher(input).matches();
    }


}