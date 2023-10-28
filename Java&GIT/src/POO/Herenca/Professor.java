package POO.Herenca;

public class Professor extends Pessoa{

    public String disciplina;
    public int horas;
    Professor(String nome, String sobrenome, int idade, String CPF, String disciplina, Integer horas) {
        super(nome, sobrenome, idade, CPF);
        this.disciplina = disciplina;
        this.horas = horas;

    }
}
