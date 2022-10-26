package br.simoes.wendel.beginner;

import java.util.Scanner;

public class Average1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();

        double AVG = ((A * 3.5) + (B * 7.5)) / 11;

        System.out.println("MEDIA = " + String.format("%.5f", AVG));
    }
}
