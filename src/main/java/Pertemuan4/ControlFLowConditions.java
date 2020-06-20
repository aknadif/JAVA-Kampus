/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan4;

/**
 *
 * @author aknadif
 */
import java.util.Scanner;
public class ControlFLowConditions {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------");
        System.out.println("|   Program Penghitungan Nilai Mahasiswa    |");
        System.out.println("---------------------------------------------");
        String nama;
        int nim,absen;
        double hasil,tugas,uts,uas,x,y,z,abs;
        
        Scanner mhs = new Scanner(System.in);
        System.out.println("Masukkan Nama : ");
        nama = mhs.nextLine();
        System.out.println("Jumlah Absen : ");
        absen = mhs.nextInt();
        System.out.println("Masukkan Nilai Tugas : ");
        tugas = mhs.nextInt();
        System.out.println("Masukkan Nilai UTS : ");
        uts = mhs.nextInt();
        System.out.println("Masukkan Nilai UAS : ");
        uas = mhs.nextInt();
        mhs.close();
        
        System.out.println("Nama = "+ nama );
        if (absen < 9){
            System.out.println("Jumlah absen anda tidak mencukupi !!!");
        }
        if (absen > 9){
            
            System.out.println("Jumlah absen anda adalah "+absen);
            System.out.println("Nilai Tugas = "+tugas+", Nilai UTS = "+uts+", Nilai UAS = "+uas);
        
            x= tugas*30/100;
            y= uts*20/100;
            z= uas*50/100;
            hasil = x+y+z;
            
            if ( hasil >=0 && hasil <= 1){                
                System.out.println("Nilai Akhir "+nama+" = " + hasil + ", Poin Anda E");                             
            }
            else if ( hasil >=2 && hasil <= 55 ){
                System.out.println("Nilai Akhir "+nama+" = " + hasil + ", Poin Anda D");
            }
            else if ( hasil >=56 && hasil <= 75  ){
                System.out.println("Nilai Akhir "+nama+" = " + hasil + ", Poin Anda C");
            }
            else if ( hasil >=76 && hasil <= 85 ){
                System.out.println("Nilai Akhir "+nama+" = " + hasil + ", Poin Anda B");
            }
            else if (hasil >=86 && hasil <= 100 ){
                System.out.println("Nilai Akhir "+nama+" = " + hasil + ", Poin Anda A");
            }
        
        }
      }
        

    }

