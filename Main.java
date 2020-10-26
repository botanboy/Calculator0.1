package com.artzarg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator();
    }

    private static void Calculator() {
        float numbA;
        float numbB;
        char matchOperation;
        float res;

        while (true) {
            Scanner inputNumb = new Scanner(System.in);
            System.out.println("Первое число: ");
            numbA = inputNumb.nextFloat();
            System.out.println("Второе число: ");
            numbB = inputNumb.nextFloat();
            System.out.println("Ведетите математическое действие (+,-,/,*): ");
            matchOperation = inputNumb.next().charAt(0);
            switch (matchOperation) {
                case '+':
                    res = numbA + numbB;
                    System.out.println(res);
                    break;
                case '-':
                    res = numbA - numbB;
                    System.out.println(res);
                    break;
                case '/':
                    if (numbB != 0) {
                        res = numbA / numbB;
                        System.out.println(res);
                    } else
                        System.out.println("Ошибка");
                    break;
                case '*':
                    res = numbA * numbB;
                    System.out.println(res);
                    break;
            }


        }
    }
}
