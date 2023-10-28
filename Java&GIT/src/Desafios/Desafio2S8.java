package Desafios;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Desafio2S8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int necessario = 48;
        List<Integer> dias = new ArrayList<>();

        adicionaHoraDias(dias, scanner);
        exibeHoras(dias);
        verificaDias(dias, necessario);
    }

    public static void adicionaHoraDias(List<Integer> adicionaHoraAluno, Scanner scanner) {
        System.out.println("Insira a quantidade de horas trabalhadas: ");
        int hora = scanner.nextInt();
        while (hora != 0) {
            adicionaHoraAluno.add(hora);
            System.out.println("Insira a quantidade de horas trabalhadas: ");
            hora = scanner.nextInt();
        }
    }

    public static void exibeHoras(List<Integer> exibeHora) {
        for (int i = 0; i < exibeHora.size(); i++) {
            System.out.println(i + ") " + exibeHora.get(i));
        }
    }

    public static void verificaDias(List<Integer> exibeHora, int necessario) {
        int totalHoras = 0;
        for (int i = 0; i < exibeHora.size(); i++) {
            totalHoras += exibeHora.get(i);
        }
        if (totalHoras < necessario) {
            System.out.println("Você está devendo: " + (necessario - totalHoras) + " horas.");
        } else {
            System.out.println("Você tem sobrando: " + (totalHoras - necessario) + " horas.");
        }
    }
}
