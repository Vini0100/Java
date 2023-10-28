/*O exercício aqui proposto tem como base o que foi ensinado nas aulas até o momento e você tem plena capacidade de fazer, não deixe de praticar porque somente com a prática você aprenderá de verdade e se sentirá mais seguro. Vamos lá!

1 - Crie a package com.minhaempresa.exercicios e crie a classe Exercicio003 que deverá ficar nesta package;

2 -   Peça para o usuário entrar com um valor;

3- Se o valor inserido for par informe que o valor digitado é par por quatro vezes, caso contrário informe que o valor é ímpar por três vezes;

% é o operador módulo que retorna o resto da divisão.
Exemplo: Para retornar o resto da divisão de 10 por 2 em Java fazemos assim:
double resto  =  10 % 2;
O resultado será zero porque esse cálculo não tem resto.
Entende-se então que qualquer valor dividido por 2 que retorne zero é par.
Observe que após a entrada de dados acima e antes de pedir para o usuário escrever novamente é necessário
executar o comando nextLine(), do contrário o seu código não funcionará adequadamente devido a tecla "enter" que foi dada anteriormente estar ainda aguardando para ser lida.

4 - Em seguida peça para o usuário escrever uma frase e imprima a frase escrita invertida e em letra maiúscula. Exemplo: "Um teste" ficaria "ETSET MU";

5 - No final escreva na console a data e hora atual por exemplo: 11/06/2022 10:59:23

*/

import java.util.Date;
import java.util.Scanner;

public class Ex3 {
    public static void calculaPar(int num1) {
        if (num1 % 2 == 0) {
            System.out.println("O numero " + num1 + " é par!");
        } else {
            System.out.println("O numero " + num1 + " é impar!");
        }
    }
    public static void inverteFrase(String a) {
        String fraseInvertida = "";
        for (int i = a.length(); i > 0; i--) {
            fraseInvertida = fraseInvertida + a.substring(i - 1, i);
        }
        System.out.println(fraseInvertida);
    }


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Write a number: ");
        int num1 = teclado.nextInt();
        teclado.nextLine(); // Consumir o caractere de nova linha
        calculaPar(num1); // Chama a função

        System.out.println("Write a phrase: ");
        String phrase = teclado.nextLine(); // Lê uma linha de entrada
        inverteFrase(phrase);

        Date date = new Date();
        System.out.println("A data atual é "  + date);
    }


}


