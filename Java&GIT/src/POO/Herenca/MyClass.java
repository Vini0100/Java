package POO.Herenca;

public class MyClass {
    public static void main (String[] args) {
        Aluno manuel = new Aluno("Manuel", "neto", 26, "02941222146", "P3º", "A");
        Professor Joao = new Professor("Joao", "Neto", 50, "99999999999", "Ingles", 90);
        System.out.println(manuel.saudacao());
        System.out.println(manuel.serie);
        System.out.println(manuel.turma);
        System.out.println(Joao.saudacao());
        System.out.println(Joao.disciplina);
        System.out.println(Joao.horas);
    }
}
