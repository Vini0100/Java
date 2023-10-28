package POO.Polimorfismo;

import java.lang.invoke.StringConcatFactory;

public class Professor extends Pessoa implements IPessoa{

    public String disciplina;
    public int horas;
    Professor(String nome, String sobrenome, int idade, String CPF, String disciplina, Integer horas) {
        super(nome, sobrenome, idade, CPF);
        this.disciplina = disciplina;
        this.horas = horas;
    }

    public String saudacao(){
        return String.format("Olá, meu nome é %s %s e sou professor de %s", this.nome, this.sobrenome, this.disciplina);
    }
}
