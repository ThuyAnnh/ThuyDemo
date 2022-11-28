package org.example;

public class Main {
    public static void main(String[] args) {
        Bai09 sv1 = new Bai09(12,"thuy",9.2,10);
        sv1.diemTrungBinh(9.2,10);
        sv1.displayInformation();
        System.out.print(" - diemTB: " + sv1.diemTrungBinh(sv1.getDiemLyThuyet(), sv1.getDiemThucHanh()) + " - Xep loai: ");
        sv1.xepLoai(sv1.getDiemLyThuyet(), sv1.getDiemThucHanh());

    }
}