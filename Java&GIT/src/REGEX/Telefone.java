package REGEX;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Telefone {

    private static final Pattern PHONE_NUMBER_PATTERN = Pattern.compile("^\\(\\d{2}\\)\\s?\\d{4,5}-?\\d{4}$");

    public static boolean isValid(String phoneNumber) {
        Matcher matcher = PHONE_NUMBER_PATTERN.matcher(phoneNumber);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] phoneNumbers = {"(11) 91234-5678", "(21) 998765432", "(31) 1234-5678", "(41) 987654321"};

        for (String phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber + " é válido? " + isValid(phoneNumber));
        }
    }
}
