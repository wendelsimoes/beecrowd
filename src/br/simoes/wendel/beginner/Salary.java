package br.simoes.wendel.beginner;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int employeeNumber = sc.nextInt();
        int workedHours = sc.nextInt();
        double amountPerHour = sc.nextDouble();

        double salary = amountPerHour * workedHours;

        System.out.println("NUMBER = " + employeeNumber);
        System.out.println("SALARY = U$ " + String.format("%.2f", salary));
    }
}
