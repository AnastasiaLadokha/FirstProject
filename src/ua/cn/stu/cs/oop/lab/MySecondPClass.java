package ua.cn.stu.cs.oop.lab;

import java.util.Scanner;

import static java.util.Arrays.*;

public class MySecondPClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть довжину масиву ");
        int size = scanner.nextInt();
        scanner.close();
        double[] arr = new double[size];
        for (int i = 0; i < arr.length; i++){
            arr[i] = Math.random() * 100;
        }
        sort(arr);
        System.out.println("Ось числа масиву:");
        for (double d : arr){
            System.out.printf("%6.2f", d);
        }
        System.out.println();
    }
}
