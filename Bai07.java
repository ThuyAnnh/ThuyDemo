package org.example;
import java.util.Scanner;

public class Bai07 {
    public static void main(String[] args) {
        String chuoi1, chuoi2, s1, s2;
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi kí tự 1: ");
        chuoi1 = sc.nextLine();
        System.out.println("Nhập vào chuỗi kí tự 2: ");
        chuoi2 = sc.nextLine();
        s1 = chuoi1.toUpperCase();
        s2 = chuoi2.toUpperCase();
        System.out.println("Chuyển chuỗi kí tự 1 thành in hoa: " + s1);
        System.out.println("Chuyển chuỗi kí tự 2 thành in hoa: " + s2);
        System.out.print("Đảo ngược chuỗi kí tự 1: ");
        for (i = s1.length() - 1; i >= 0; i--) {
            System.out.print("" + s1.charAt(i));
        }
        System.out.print("\nĐảo ngược chuỗi kí tự 1: ");
        for (i = s2.length() - 1; i >= 0; i--) {
            System.out.print("" + s2.charAt(i));
        }
        System.out.println("\nĐếm số kí tự: ");
        for (i = 0; i < chuoi1.length(); i++) {
            char s = chuoi1.charAt(i);
            System.out.print(s + ": ");
            int sum = 0;
            for (j = 0; j < chuoi1.length(); j++) {
                if (s == chuoi1.charAt(j)) {
                    sum++;
                }
            }
            System.out.print(sum);
            System.out.print("\t");
        }
    }
}
