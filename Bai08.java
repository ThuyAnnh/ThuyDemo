package org.example;
import java.util.Scanner;

public class Bai08 {
    public static void main(String[] args) {
        int n, m, i, min = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào n: ");
        n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        System.out.print("Nhập các phần tử của mảng 1: \n");
        for (i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr1[i] = sc.nextInt();
        }
        System.out.print("Nhập các phần tử của mảng 2: \n");
        for (i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr2[i] = sc.nextInt();
        }
        System.out.print("\nMảng 1 được sắp xếp theo thứ tự tăng dần là: ");
        int temp = arr1[0];
        for (i = 0; i < arr1.length - 1; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] > arr1[j]) {
                    temp = arr1[j];
                    arr1[j] = arr1[i];
                    arr1[i] = temp;
                }
            }
        }
        for (i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.print("\nMảng 2 được sắp xếp theo thứ tự tăng dần là: ");
        int temp1 = arr2[0];
        for (i = 0; i < arr2.length - 1; i++) {
            for (int j = i + 1; j < arr2.length; j++) {
                if (arr2[i] > arr2[j]) {
                    temp1 = arr2[j];
                    arr2[j] = arr2[i];
                    arr2[i] = temp1;
                }
            }
        }
        int a = 0;
        for (i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        for (i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]){
                    System.out.println("\nGiá trị chung: " + arr1[i]);
                    a++;
                }
            }
        }
        if (a == 0){
            System.out.println("\nKhông có giá trị chung nào");
        }
    }
}
