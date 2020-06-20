/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan8;

import static Pertemuan8.AnakKampus.staticmethod;

/**
 *
 * @author aknadif
 */

class AnakKampus{
    String nama,nim;
    
    AnakKampus (String nama, String nim){
     this.nama = nama;
     this.nim = nim;
    }
//    Static Method
    static void staticmethod(){
        System.out.println("Nama = Ahmad Khainur Nadhif" );
        System.out.println("NIM = 1803010024");        
    }
//    Public Method
    public void publictampil(){
        System.out.println("Nama = " + this.nama);
        System.out.println("NIM = " + this.nim); 
    }
    
}

//  Main Method
public class Method {
    public static void main(String[] args){
        
//      Panggil Method Static
        System.out.println("Static Method");
        staticmethod();

//      Public Method
        AnakKampus ak1 = new AnakKampus("Ahmad Khainur Nadhif", "1803010024");
        System.out.println("Pubic Method");
        ak1.publictampil();
        
    }
}
