package ua.cn.stu.cs.oop.lab;

import java.util.Scanner;

public class FirstProject {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Введіть дані про студента за таким шаблоном:\n");
        stringBuilder.append("Ім'я студента/статус(бюджет чи контракт)\nВведіть оцінки за період сесії\n");
        stringBuilder.append("Петров Петро/бюджет/\n");
        stringBuilder.append("A B A C D E A A\n");
        stringBuilder.append("Введіть дані про студента");
        System.out.println(stringBuilder);
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("/");
        String name = sc.next();
        String status = sc.next();
        System.out.println("Введіть оцінки за сесію");
        int[] arr = new int[8];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            String a = scan.next();
            if (a.equals("E") || a.equals("D")) {
                arr[i] = 3;
            } else if (a.equals("C") || a.equals("B")) {
                arr[i] = 4;
            } else if (a.equals("A")) {
                arr[i] = 5;
            }
        }
        if (status.equals("контракт")) {
            System.out.println(name + " не може мати стипендію, бо на контракті");
            System.exit(0);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 3) {
                System.out.println(name + " не може мати стипендію, адже має 3");
                System.exit(0);
            }
        }
        System.out.println(name + " має стипендію");
    }
}
