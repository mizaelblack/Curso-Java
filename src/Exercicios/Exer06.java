package Exercicios;

import java.util.Scanner;

public class Exer06 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("entre com o valor/hora");
        double valorHora = scan.nextDouble();

        System.out.println("Entre com a quantidade de horas trabalhada no mês:");
        double horas = scan.nextDouble();

        double salario = valorHora * horas;

        System.out.println(" O salario é de: " + salario);


    }
}
