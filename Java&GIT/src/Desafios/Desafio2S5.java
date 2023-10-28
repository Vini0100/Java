package Desafios;

public class Desafio2S5 {
    public static void main(String[] args) {    
        double corredor1 = 10.50;
        double corredor2 = 8.70;
        double corredor3 = 5.40;

        if (corredor1 < corredor2 && corredor1 < corredor3){
            System.out.println("Corredor1 Wins!");}
            else if (corredor2 < corredor3) {
                System.out.println("Corredor2 Wins!");
            }
            else {
                System.out.println("Corredor3 Wins!");
            }

        }
    }