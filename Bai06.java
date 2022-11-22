package org.example;
import java.util.Scanner;

public class Bai06 {
    public static void main(String[] args) {
        String chuoi;
        char s;
        boolean display = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào 1 chuỗi kí tự: ");
        chuoi = sc.nextLine();
        System.out.print("Nhập vào kí tự: ");
        s = sc.nextLine().charAt(0);
        for (int i = 0; i < chuoi.length(); i++) {
            if (s == chuoi.charAt(i)) {
                display = true;
            }
        }
        if (display == false)
            System.out.print("Không");
        else
            System.out.print("Có");
    }
}