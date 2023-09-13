package Exercicios;

import java.util.Scanner;

public class Exer10 {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.println(" Entre com a autura");
        double altura = scan.nextDouble();

        double pesoIdeal = (72.7*altura) - 58;

        System.out.println( " O peso ideal : " + pesoIdeal);

    }
}
