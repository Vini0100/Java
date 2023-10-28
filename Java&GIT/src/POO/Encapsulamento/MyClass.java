package POO.Encapsulamento;

public class MyClass {
    public static void main (String[] args) {
        Pessoa manuel = new Pessoa("Manuel", "neto", 26, "02941222146");
        System.out.println(manuel.nome);
        System.out.println(manuel.sobrenome);
        System.out.println(manuel.idade);
        System.out.println(manuel.saudacao());
        System.out.println(manuel.getCPF());
        manuel.setCPF("84206012920");
        System.out.println(manuel.getCPF());
    }
}
