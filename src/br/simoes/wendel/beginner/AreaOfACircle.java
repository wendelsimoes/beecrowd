package br.simoes.wendel.beginner;
import java.util.Scanner;

public class AreaOfACircle {
    public static final double PI = 3.14159D;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double R = sc.nextDouble();
        double area = PI * Math.pow(R, 2);

        System.out.println("A=" + String.format("%.4f", area));
    }
}
