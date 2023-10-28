/*O exercício aqui proposto tem como base o que foi ensinado nas aulas até o momento e você tem plena capacidade de fazer, não deixe de praticar porque somente com a prática você aprenderá de verdade e se sentirá mais seguro. Vamos lá!
No projeto Exercicios criado anteriormente:

1 - Crie a classe  Exercicio002. Esta classe deve pedir para o usuário entrar com quatro valores através da console;

2 - Tire a média dos valores e se o resultado for maior ou igual a 7.0 informe no console "Parabéns! Você aprovado com média:  X", caso contrário informe "Você foi reprovado com média: X", onde X é o valor da média;

Obs.: A fórmula para calcular a média é:

media = (nota1 + nota2 + nota3 + nota4) / 4

*/
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        System.out.println("Write your four notes: ");
        float num1 = teclado.nextFloat();
        float num2 = teclado.nextFloat();
        float num3 = teclado.nextFloat();
        float num4 = teclado.nextFloat();
        float total = (num1 + num2 + num3 + num4)/4;
        if (total >= 7) {
            System.out.println("You are aproved with media: " + total);
        } else {
            System.out.println("You are not aproved, your media was: " + total);
        }
    }
}
