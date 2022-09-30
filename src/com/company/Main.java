package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String ageMyFriend;
        final int NUM = 25;
        String word = "flour ";
        ageMyFriend = word + NUM;
        System.out.println(ageMyFriend);
        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        }
        else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }
        System.out.println("_________________________________________________");
        System.out.println("Введите свое имя...");
        String name = "Как тебя зовут?";
        Scanner scan = new Scanner(System.in);
        String x1 = scan.nextLine();
        System.out.println("Салам Алейкум " + x1 + "!");

    }

}
