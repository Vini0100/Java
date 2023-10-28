package POO.Encapsulamento;

import java.util.Scanner;

public class Pessoa {
    public Scanner scanner = new Scanner(System.in);
    public String nome;
    public String sobrenome;
    public int idade;
    private String CPF;

        Pessoa(String nome, String sobrenome, int idade, String CPF){
            this.nome = nome;
            this.sobrenome = sobrenome;
            this.idade = idade;
            this.CPF = CPF;
        }

        public String saudacao() {
            return String.format("Olá, meu nome é %s %s", this.nome, this.sobrenome);
        }

        public String getCPF(){
            return this.CPF;
        } //Fucao para retornar o CPF

        public void setCPF(String novocpf){
            this.CPF = novocpf;
        } //Funcao para setar um novo CPF
}
