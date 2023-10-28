package Logic;
import java.util.Scanner;
public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double somadorNotas = 0;
        int somadorNumeroNotas = 0;

//        while(nota != 0) {
//            System.out.println("Insira uma nota: ");
//            nota = scanner.nextDouble();
//            if (nota != 0){
//                somadorNotas += nota;
//                somadorNumeroNotas += 1;
//            }
//        }
//        double media = somadorNotas/somadorNumeroNotas;
//        System.out.println("Media: " + media);
//    }
//}

        while(true) {
            System.out.println("Insira uma nota: ");
            double nota = scanner.nextDouble();
            somadorNotas += nota;
            somadorNumeroNotas += 1;
            if (nota == 0){
                break;
            }
        }
        double media = somadorNotas/somadorNumeroNotas;
        System.out.println("Media: " + media);
    }
}
