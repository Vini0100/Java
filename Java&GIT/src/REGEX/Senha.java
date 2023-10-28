package REGEX;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Senha {

    private static final Pattern PASSWORD_PATTERN = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=!])(?!.*\\s).{8,}$");

    public static boolean isValid(String password) {
        Matcher matcher = PASSWORD_PATTERN.matcher(password);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] passwords = {"Abc123@def", "Password123", "WeakPwd", "Strong123!"};

        for (String password : passwords) {
            System.out.println(password + " é uma senha válida? " + isValid(password));
        }
    }
}
