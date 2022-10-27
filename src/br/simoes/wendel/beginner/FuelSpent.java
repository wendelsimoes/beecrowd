package br.simoes.wendel.beginner;

import java.util.Scanner;

public class FuelSpent {

    public static final double FUELPERKM = 12.0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int spentTime = sc.nextInt();
        int averageSpeed = sc.nextInt();

        int distanceTraveled = spentTime * averageSpeed;
        double spentFuel = distanceTraveled / FUELPERKM;

        System.out.println(String.format("%.3f", spentFuel));
    }
}
