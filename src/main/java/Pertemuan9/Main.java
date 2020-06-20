/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan9;

/**
 *
 * @author aknadif
 */
class Mahasiswa{
        String nama,nim;
        int tugas,uts,uas,hasil;
        
        Mahasiswa(String nama, String nim, int tugas, int uts, int uas){
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
            public static int kali (int x, int y){
                    return x * y;
                    }
                    //    Overloading
                    public static double kali (int x, double y){
                    return (double)x * y;
                    }         
        void total(){

            
            double x = kali(this.tugas, 30/100 );
            double y = kali(this.uts, 20/100 );
            double z = kali(this.uas, 50/100 );

               hasil =  (int) (double) (x+y+z);

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
public class Main {
    
    public static void main(String[] args){
        
        Mahasiswa mhs1 = new Mahasiswa("Nadhif","1803010024",78,86,83);
        mhs1.show();
        mhs1.total();
        
    }
    
}
