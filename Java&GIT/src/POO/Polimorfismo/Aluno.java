package POO.Polimorfismo;

public class Aluno extends Pessoa implements IPessoa{

    public String serie;
    public String turma;

    Aluno(String nome, String sobrenome, int idade, String CPF, String serie, String turma) {
        super(nome, sobrenome, idade, CPF);
        this.serie = serie;
        this.turma = turma;
    }

    public String saudacao(){
        return String.format("Olá, meu nome é %s %s e estou na %s série %s", this.nome, this.sobrenome, this.serie, this.turma);
    }
}
