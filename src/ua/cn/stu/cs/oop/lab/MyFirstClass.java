package ua.cn.stu.cs.oop.lab;

import java.util.Scanner;

public class MyFirstClass {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Введіть дані за таким шаблоном:\n");
        stringBuilder.append("Прізвище та ім'я/кіл-сть незадов. оцінок/сер. бал/\n");
        stringBuilder.append("Наприклад: \nКіт Базіліо/2/2,4/");
        System.out.println(stringBuilder);
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("/");
        String name = scanner.next();
        int n = scanner.nextInt();
        float b = scanner.nextFloat();
        scanner.close();
        System.out.println(name + ": двійок " + n + "; сер. бал " + b);
    }
}
