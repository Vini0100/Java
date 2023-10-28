package com.minhaempresa.exemplo;

import com.minhaempresa.exemplo.encapsulamento.Filha;

public class Constante {
    public final static double PI = 3.14159265359;//Exemplo de uma constante
    private String nome = "Marcos";//Exemplo de uma variável

    public static void main (String [] args) {
        Constante teste = new Constante();
        System.out.println(PI);
        System.out.println(teste.nome);
        teste.nome = "Marcelo";
        System.out.println(teste.nome);
        //PI = 2.3;
    }

    public final void Exemplo () {
        System.out.print("Teste");
    }
}
