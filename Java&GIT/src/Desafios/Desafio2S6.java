package Desafios;
import java.util.Scanner;
public class Desafio2S6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalTemperatura =0;
        double media = 0;
        double numTemperatura = 0;
        double Temperatura = 0;

        while (true){
            System.out.println("Insira uma temperatura: ");
            Temperatura = scanner.nextDouble();
            if (Temperatura == 0){
                break;
            }
            totalTemperatura += Temperatura;
            numTemperatura +=1;
        }
        media = totalTemperatura/numTemperatura;
        System.out.println("A media de temperatura eh: "+media);
    }
    }

