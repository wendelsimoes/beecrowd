package br.simoes.wendel.beginner;

import java.util.Scanner;

public class Consumption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int distanceTraveled = sc.nextInt();
        double spentFuel = sc.nextDouble();

        double consumption = distanceTraveled / spentFuel;

        System.out.println(String.format("%.3f", consumption) + " km/l");
    }
}
