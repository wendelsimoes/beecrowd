package br.simoes.wendel.beginner;

import java.util.Scanner;

public class Banknotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        System.out.println(amount);

        int hundredQuantity = amount / 100;
        System.out.println(hundredQuantity + " nota(s) de R$ 100,00");
        amount -= hundredQuantity * 100;

        int fiftyQuantity = amount / 50;
        System.out.println(fiftyQuantity + " nota(s) de R$ 50,00");
        amount -= fiftyQuantity * 50;

        int twelveQuantity = amount / 20;
        System.out.println(twelveQuantity + " nota(s) de R$ 20,00");
        amount -= twelveQuantity * 20;

        int tenQuantity = amount / 10;
        System.out.println(tenQuantity + " nota(s) de R$ 10,00");
        amount -= tenQuantity * 10;

        int fiveQuantity = amount / 5;
        System.out.println(fiveQuantity + " nota(s) de R$ 5,00");
        amount -= fiveQuantity * 5;

        int twoQuantity = amount / 2;
        System.out.println(twoQuantity + " nota(s) de R$ 2,00");
        amount -= twoQuantity * 2;

        System.out.println(amount + " nota(s) de R$ 1,00");
    }
}
