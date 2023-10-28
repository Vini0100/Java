package Desafios;

public class Desafio1S6 {
    public static void main(String[] args) {
        int valorLitro = 5;
        double quantidadeLitro;

        for (quantidadeLitro = 1; quantidadeLitro <= 5; quantidadeLitro++) {
            double total = valorLitro * quantidadeLitro;
            System.out.println("Valor do litro: " + valorLitro + " Quantidade de litros: " + quantidadeLitro + " Valor Total: " + total);
        }
    }
}
