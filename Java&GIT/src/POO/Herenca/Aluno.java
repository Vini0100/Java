package POO.Herenca;

public class Aluno extends Pessoa{

    public String serie;
    public String turma;

    Aluno(String nome, String sobrenome, int idade, String CPF, String serie, String turma) {
        super(nome, sobrenome, idade, CPF);
        this.serie = serie;
        this.turma = turma;
    }
}
