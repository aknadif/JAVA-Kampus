/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan7;



/**
 *
 * @author aknadif
 */
class Mahasiswa {
    String nama,nim;
    int tugas,uts,uas,hasil;
    
    // Constructor
    Mahasiswa (String nama, String nim, int tugas, int uts,int uas){
        this.nama = nama;
        this.nim = nim;
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
    }
    
    void show(){
        System.out.println("Nama = " + this.nama);
        System.out.println("NIM = " + this.nim);
        System.out.println("Nilai Tugas = " + this.tugas);
        System.out.println("Nilai UTS = " + this.uts);
        System.out.println("Nilai UAS = " + this.uas);   
    }
    void total(){
            int x = this.tugas*30/100;
            int y = this.uts*20/100;
            int z = this.uas*50/100;
            hasil = x+y+z;
            
             if ( hasil >=0 && hasil <= 1){                
                System.out.println("Nilai Akhir "+this.nama+" = " + hasil + ", Poin Anda E");                             
            }
            else if ( hasil >=2 && hasil <= 55 ){
                System.out.println("Nilai Akhir "+this.nama+" = " + hasil + ", Poin Anda D");
            }
            else if ( hasil >=56 && hasil <= 75  ){
                System.out.println("Nilai Akhir "+this.nama+" = " + hasil + ", Poin Anda C");
            }
            else if ( hasil >=76 && hasil <= 85 ){
                System.out.println("Nilai Akhir "+this.nama+" = " + hasil + ", Poin Anda B");
            }
            else if (hasil >=86 && hasil <= 100 ){
                System.out.println("Nilai Akhir "+this.nama+" = " + hasil + ", Poin Anda A");
            }
    }
    
}
