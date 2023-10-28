package REGEX;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CPF {

    private static final Pattern CPF_PATTERN = Pattern.compile("^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$");

    public static boolean isValid(String cpf) {
        Matcher matcher = CPF_PATTERN.matcher(cpf);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] cpfs = {"029.412.221-46", "842.060.129-20"};

        for (String cpf : cpfs) {
            System.out.println(cpf + " é válido? " + isValid(cpf));
        }
    }
}
