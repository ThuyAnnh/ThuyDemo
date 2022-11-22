package org.example;
import java.util.Scanner;

public class Bai02 {
    public static void main(String[] args) {
        int n, m, i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Bạn muốn nhập vào bao nhiêu số để kiểm tra: ");
        m = sc.nextInt();
        for (i = 0; i < m; i++) {
            System.out.print("Nhập vào số nguyên n: ");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Một");
                    break;
                case 2:
                    System.out.println("Hai");
                    break;
                case 3:
                    System.out.println("Ba");
                    break;
                case 4:
                    System.out.println("Bốn");
                    break;
                case 5:
                    System.out.println("Năm");
                    break;
                case 6:
                    System.out.println("Sáu");
                    break;
                case 7:
                    System.out.println("Bảy");
                    break;
                case 8:
                    System.out.println("Tám");
                    break;
                case 9:
                    System.out.println("Chín");
                    break;
                case 10:
                    System.out.println("Chín");
                    break;
                default:
                    System.out.println("Nhập từ 1-10 đi! Cứ để phải cáu.");
                    break;
            }
        }
    }
}