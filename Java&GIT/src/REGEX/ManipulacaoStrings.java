package REGEX;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ManipulacaoStrings {

    public static void main(String[] args) {
        String dataAmericana = "2023-03-02";
        Pattern padrao = Pattern.compile("(\\d{4})-(\\d{2})-(\\d{2})");
        Matcher matcher = padrao.matcher(dataAmericana);

        if (matcher.matches()) {
            String ano = matcher.group(1);
            String mes = matcher.group(2);
            String dia = matcher.group(3);

            System.out.println(dia + "/" + mes + "/" + ano);
            System.out.println("Data Brasileira");

        } else {
            System.out.println("Invalid date format");
        }
    }
}
