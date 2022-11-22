package org.example;
import java.util.Scanner;

public class Bai05 {
    public static void main(String[] args) {
        int n, m, i, min = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào n: ");
        n = sc.nextInt();
        int [] arr = new int [n];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = sc.nextInt();
        }
        System.out.print("Dãy số được sắp xếp theo thứ tự tăng dần là: "+min);
        int temp = arr[0];
        for (i = 0 ; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}