package br.simoes.wendel.beginner;

import java.util.Scanner;

public class Area {

    public static final double PI = 3.14159D;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String values = sc.nextLine();
        double A = Double.parseDouble(values.split(" ")[0]);
        double B = Double.parseDouble(values.split(" ")[1]);
        double C = Double.parseDouble(values.split(" ")[2]);

        double rectangleTriangleArea = (A * C) / 2;
        double circleArea = PI * Math.pow(C, 2);
        double trapeziumArea = ((A + B) * C) / 2;
        double squareArea = Math.pow(B, 2);
        double rectangleArea = A * B;

        System.out.println("TRIANGULO: " + String.format("%.3f", rectangleTriangleArea));
        System.out.println("CIRCULO: " + String.format("%.3f", circleArea));
        System.out.println("TRAPEZIO: " + String.format("%.3f", trapeziumArea));
        System.out.println("QUADRADO: " + String.format("%.3f", squareArea));
        System.out.println("RETANGULO: " + String.format("%.3f", rectangleArea));
    }
}
