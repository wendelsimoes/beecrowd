package br.simoes.wendel.beginner;

import java.util.Scanner;

public class TheGreatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String values = sc.nextLine();
        int A = Integer.parseInt(values.split(" ")[0]);
        int B = Integer.parseInt(values.split(" ")[1]);
        int C = Integer.parseInt(values.split(" ")[2]);

        System.out.println(greatest(greatest(A, B), C) + " eh o maior");
    }

    public static int greatest(int A, int B) {
        return (A + B + Math.abs(A - B)) / 2;
    }
}
