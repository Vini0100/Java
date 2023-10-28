package Desafios;
import java.util.Scanner;
public class Desafio1S7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroClassificacao;
        int escolha;
        int resultado = 0;

        System.out.println("Bem-vindo ao solucionador de crimes mais incrível de todos!");
        System.out.println("As perguntas abaixo devem ser respondidas pelo suposto culpado! 0 para NÃO e 1 para SIM");

        System.out.println("Telefonou para a Vítima?");
        escolha = scanner.nextInt();
        resultado += escolha;

        System.out.println("Esteve no local do crime?");
        escolha = scanner.nextInt();
        resultado += escolha;

        System.out.println("Mora perto da Vítima?");
        escolha = scanner.nextInt();
        resultado += escolha;

        System.out.println("Devia para a Vítima?");
        escolha = scanner.nextInt();
        resultado += escolha;

        System.out.println("Já trabalhou com a vítima?");
        escolha = scanner.nextInt();
        resultado += escolha;

        System.out.println("O resultado é: " + Verificacao(resultado));
    }

    public static String Verificacao(int resultado) {
        switch (resultado) {
            case 0:
            case 1:
                return "Inocente";
            case 2:
                return "Suspeita";
            case 3:
            case 4:
                return "Cúmplice";
            case 5:
                return "Assassino";
            default:
                return "Classificação desconhecida";
        }
    }
}

//    public static int somaDados(boolean escolha) {
//        int resultado;
//        if (escolha == true) {
//            resultado = 1; // Se escolha for verdadeira (1), o resultado é 1
//        } else {
//            resultado = 0; // Se escolha for falsa (0), o resultado é 0
//        }
//        return resultado;
//    }
//}