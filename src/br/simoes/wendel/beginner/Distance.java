package br.simoes.wendel.beginner;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int distance = sc.nextInt();

        double howLongToTakeDistance = (distance / 30.0) * 60;

        System.out.println(String.format("%.0f", howLongToTakeDistance) + " minutos");
    }
}
