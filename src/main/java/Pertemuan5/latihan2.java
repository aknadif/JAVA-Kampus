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
public class latihan2 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai maksimal deret fibonacci :");
        int max = input.nextInt();
        int nomorsebelum = 0;
        int nomorsesudah = 1;
        input.close();
        System.out.print("Max deret " + max + " maka deret fibonacci : ");

        for (int i = 1; i <= max; ++i) {
            System.out.print(nomorsebelum + " ");
            int jumlah = nomorsebelum + nomorsesudah;
            nomorsebelum = nomorsesudah;
            nomorsesudah = jumlah;
        }
}
}