/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan6;

/**
 *
 * @author aknadif
 */
public class latihan2 {
 public static void main(String[] args) {
        int[] a = {25, 15, 35};
        int[] b = {52, 51, 53};
        //Output untuk menampilkan 2.a
        System.out.println("Menampilkan jumlah yang ada di setiap anggota elemen array : ");
        System.out.println("");
            //array a
            int hasil1 = a[0]+a[1]+a[2];
            System.out.println("Jumlah pada anggota elemen array a adalah " + hasil1);
            //array b
            int hasil2 = b[0]+b[1]+b[2];
            System.out.println("Jumlah pada anggota elemen array b adalah " + hasil2);
        System.out.println("");
        //Output untuk menampilkan 2.b
        System.out.println("Menampilkan Penjumlahan kedua array yang berindeks sama : ");
        int jml1 = a[0]+b[0];
        int jml2 = a[1]+b[1];
        int jml3 = a[2]+b[2];
        System.out.println("Hasil dari Penjumlahanya adalah "+ jml1 + ","+ jml2 + ","+ jml3);

        }    
}
