package org.example;
import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        int n, m, i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Bạn muốn nhập vào bao nhiêu số để kiểm tra : ");
        m = sc.nextInt();
        for (i = 0; i < m; i++) {
            System.out.print("Nhập vào số cần kiểm tra n: ");
            n = sc.nextInt();
            if (n >= 0) {
                System.out.println("\nĐây là số nguyên dương");
            } else {
                System.out.println("\nĐây là số nguyên âm!");
            }
        }
    }
}