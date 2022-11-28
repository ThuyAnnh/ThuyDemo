package org.example;

import java.util.Scanner;

public class Bai09 {
    private int maSV;
    private String hoTen;
    private double diemLyThuyet;
    private double diemThucHanh;

    public Bai09(int maSV, String hoTen,double diemLyThuyet, double diemThucHanh){
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemLyThuyet = diemLyThuyet;
        this.diemThucHanh = diemThucHanh;
    }

    public void displayInformation() {
        System.out.print("MSV: " + maSV + " - Ho ten: " + hoTen + " - diemLT: " + diemLyThuyet + " - diemTH: " + diemThucHanh );
    }

    public double diemTrungBinh(double diemLyThuyet, double diemThucHanh) {
        return (diemLyThuyet + diemThucHanh)/2;
    }
    public void xepLoai(double diemLyThuyet, double diemThucHanh) {
        if ((diemLyThuyet + diemThucHanh)/2 < 5){
            System.out.println("Trung bình");
        }
        else if ((diemLyThuyet + diemThucHanh)/2 < 7.9){
            System.out.println("Khá");
        }
        else if ((diemLyThuyet + diemThucHanh)/2 <= 10 || (diemLyThuyet + diemThucHanh)/2 > 8){
            System.out.println("Giỏi");
        }
    }

    public double getDiemLyThuyet() {
        return diemLyThuyet;
    }

    public double getDiemThucHanh() {
        return diemThucHanh;
    }
}
