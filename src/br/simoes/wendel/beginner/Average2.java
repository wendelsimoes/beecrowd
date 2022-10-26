package br.simoes.wendel.beginner;

import java.util.Scanner;

public class Average2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double AVG = ((A * 2) + (B * 3) + (C * 5)) / 10;

        System.out.println("MEDIA = " + String.format("%.1f", AVG));
    }
}
