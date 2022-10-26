package br.simoes.wendel.beginner;

import java.util.Scanner;

public class SimpleCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String product1 = sc.nextLine();
        String product2 = sc.nextLine();

        int product1Units = Integer.parseInt(product1.split(" ")[1]);
        int product2Units = Integer.parseInt(product2.split(" ")[1]);
        double product1Price = Double.parseDouble(product1.split(" ")[2]);
        double product2Price = Double.parseDouble(product2.split(" ")[2]);

        double totalToBePaid = (product1Price * product1Units) + (product2Price * product2Units);

        System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", totalToBePaid));
    }
}
