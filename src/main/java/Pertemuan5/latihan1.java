/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan5;

/**
 *
 * @author aknadif
 */
import java.util.Scanner;
public class latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Angka : ");
        int angka = input.nextInt();
        System.out.println("Masukkan nilai pangkat maksimal :");
        int maks = input.nextInt();
        input.close();
        for (int i = 1; i < maks; i++) {
            double hasil;
            hasil = Math.pow(angka, i);
            System.out.println(angka + " Pangkat " + i + " = " + hasil);
        }
    }
}
