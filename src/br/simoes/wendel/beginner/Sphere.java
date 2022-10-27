package br.simoes.wendel.beginner;

import java.util.Scanner;

public class Sphere {

    public static final double PI = 3.14159D;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int radius = sc.nextInt();

        double volume = (4.0/3.0) * PI * Math.pow(radius, 3);

        System.out.println("VOLUME = " + String.format("%.3f", volume));
    }
}
