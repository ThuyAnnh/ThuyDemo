package org.example;
import java.util.Scanner;

public class Bai03 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào cạnh a: ");
        a = sc.nextInt();
        System.out.print("Nhập vào cạnh b: ");
        b = sc.nextInt();
        System.out.print("Nhập vào cạnh c: ");
        c = sc.nextInt();
        if(a*a+b*b==c*c || b*b+c*c==a*a || c*c+a*a==b*b)
            System.out.println("Ba số là 3 cạnh của một tam giác vuông");
        else
            System.out.println("Ba số không phải là 3 cạnh của một tam giác vuông");
    }
}