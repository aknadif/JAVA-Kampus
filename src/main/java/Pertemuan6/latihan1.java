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
public class latihan1 {
    public static void main(String[] args) {
        String [] hari = {
            "Senin", "Selasa", "Rabu", "Kamis",
             "Jumat", "Sabtu", "Minggu"};

             System.out.println("Hari saya mengerjakan laporan Praktikum = " + hari[0]);
             System.out.println("");
             //Tampilan semua hari menggunakan for
             System.out.println("Menampilkan semua hari dengan for : ");
             for (int a= 0; a < hari.length;a++)
             System.out.println(hari[a]);
             System.out.println("");
             //Tampilan semua hari menggunakan foreach
             System.out.println("Menampilkan semua hari dengan foreach : ");
             for(String b : hari){
                 System.out.println(b);
             }             
    } 
}
