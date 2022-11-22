package org.example;
import java.util.Scanner;

public class Bai04 {
    public static void main(String[] args) {
        int n, i, s = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên n: ");
        n = sc.nextInt();
        for (i = 0; i <= n; i++){
            if (i%2 == 0)
                s+=i;
        }
        System.out.print("Tổng tất cả số chẵn trong khoảng từ 0 - n: "+s);
    }
}