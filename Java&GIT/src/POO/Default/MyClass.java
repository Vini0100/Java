package POO.Default;

public class MyClass {
    public static void main (String[] args) {
        Pessoa manuel = new Pessoa("Manuel", "neto", 26);
        System.out.println(manuel.nome);
        System.out.println(manuel.sobrenome);
        System.out.println(manuel.idade);
        System.out.println(manuel.saudacao());

        Pessoa joao = new Pessoa("Joao", "Pessoa", 17);
        System.out.println(joao.nome);
        System.out.println(joao.sobrenome);
        System.out.println(joao.idade);
        System.out.println(joao.saudacao());
    }
}
