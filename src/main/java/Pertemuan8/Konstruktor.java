/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan8;

/**
 *
 * @author aknadif
 */
class Mahasiswa {
    
    String nama,nim;
    
//    Constructor
    
        Mahasiswa (String nama, String nim){
            this.nama = nama;
            this.nim = nim;
        }
        void tampil(){
        System.out.println("Nama = " + this.nama);
        System.out.println("NIM = " + this.nim);
        }
}

public class Konstruktor {
    public static void main(String[] args){
    
        Mahasiswa mhs1 = new Mahasiswa("Ahmad Khainur Nadhif", "1803010024");
        mhs1.tampil();                 
        
    }
    
}
