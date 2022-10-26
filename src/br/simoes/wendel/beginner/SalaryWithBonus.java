package br.simoes.wendel.beginner;

import java.util.Scanner;

public class SalaryWithBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sellerFirstName = sc.nextLine();
        double sellerSalary = sc.nextDouble();
        double sellerTotalSold = sc.nextDouble();

        double totalSalary = sellerSalary + sellerTotalSold * 0.15D;

        System.out.println("TOTAL = R$ " + String.format("%.2f", totalSalary));
    }
}
