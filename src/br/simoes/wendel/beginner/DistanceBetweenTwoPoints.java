package br.simoes.wendel.beginner;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String point1 = sc.nextLine();
        String point2 = sc.nextLine();

        double x1 = Double.parseDouble(point1.split(" ")[0]);
        double y1 = Double.parseDouble(point1.split(" ")[1]);
        double x2 = Double.parseDouble(point2.split(" ")[0]);
        double y2 = Double.parseDouble(point2.split(" ")[1]);

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println(String.format("%.4f", distance));
    }
}
