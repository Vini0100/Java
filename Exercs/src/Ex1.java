/*Somente com a prática você aprenderá! Tenha isso em mente! Portanto segue um desafio e peço que faça.
Além de testar o que você aprendeu, isso lhe dará mais confiança. Vamos lá ao desafio!
O exercício aqui proposto tem como base o que foi ensinado nas aulas até o momento e você tem plena capacidade de fazer!

Crie um projeto no Intellij com nome: Exercicios

1 - Crie a classe  Exercicio001 que peça para o usuário entrar com dois valores através da console;

2 - Mostre na console a soma dos valores informados;

3 - Em seguida mostre a raiz quadrada desta soma;
*/
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite aqui o primeiro numero: ");
        int num1 = teclado.nextInt();
        System.out.println("Digite aqui o segundo numero: ");
        int num2 = teclado.nextInt();
        int result = (num1 + num2);
        System.out.println("O resultado da soma eh: " + result);
        System.out.println("A Raiz quadrada da soma eh:" + Math.sqrt(result));
    }
}
