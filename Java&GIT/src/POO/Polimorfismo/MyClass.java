package POO.Polimorfismo;

public class MyClass {
    public static void main (String[] args) {
        Aluno manuel = new Aluno("Manuel", "neto", 26, "02941222146", "P3º", "A");
        Professor Joao = new Professor("Joao", "Neto", 50, "99999999999", "Ingles", 90);
        System.out.println(manuel.saudacao());
        System.out.println(Joao.saudacao());

    }
}
