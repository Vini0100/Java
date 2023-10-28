package Desafios;

public class Desafio1S5 {
    public static void main(String[] args) {
        String usuario = "teste";
        String senha = "tomatoma";
        String validacao = usuario == "teste" && senha == "tomatoma" ? "Credenciais Validas!" : "Credenciais invalidas";
        System.out.println(validacao);
    }
}