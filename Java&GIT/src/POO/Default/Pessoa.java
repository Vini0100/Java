package POO.Default;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Pessoa {
        Scanner scanner = new Scanner(System.in);
        String nome;
        String sobrenome;
        int idade;

        Pessoa(String nome, String sobrenome, int idade){
            this.nome = nome;
            this.sobrenome = sobrenome;
            this.idade = idade;
        }

        public String saudacao() {
            return String.format("Olá, meu nome é %s %s", this.nome, this.sobrenome);
    }
}
