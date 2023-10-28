package Desafios;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Desafio1S8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int media = 7;
        List<Integer> notaAlunos = new ArrayList<>();

        adicionanotaAluno(notaAlunos, scanner);
        exibenotaAlunos(notaAlunos);
        verificanotaAlunos(notaAlunos, media);
    }

    public static void adicionanotaAluno(List<Integer> adicionanotaAluno, Scanner scanner) {
        System.out.println("Insira a nota dos alunos (ou 0 para encerrar): ");
        int nota = scanner.nextInt();
        while (nota != 0) {
            adicionanotaAluno.add(nota);
            System.out.println("Insira a nota dos alunos (ou 0 para encerrar): ");
            nota = scanner.nextInt();
        }
    }

    public static void exibenotaAlunos(List<Integer> exibenotaAlunos) {
        for (int i = 0; i < exibenotaAlunos.size(); i++) {
            System.out.println(i + ") " + exibenotaAlunos.get(i));
        }
    }

    public static void verificanotaAlunos(List<Integer> exibenotaAlunos, int media) {
        int apv = 0;
        int rep = 0;
        for (int i = 0; i < exibenotaAlunos.size(); i++) {
            if (exibenotaAlunos.get(i) >= media) {
                ++apv;
            } else {
                ++rep;
            }
        }
        System.out.println("Os alunos aprovados são: " + apv);
        System.out.println("Os alunos reprovados são: " + rep);
    }
}