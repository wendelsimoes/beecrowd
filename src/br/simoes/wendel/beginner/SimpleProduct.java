package br.simoes.wendel.beginner;

import java.util.Scanner;

public class SimpleProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int PROD = A * B;

        System.out.println("PROD = " + PROD);
    }
}
