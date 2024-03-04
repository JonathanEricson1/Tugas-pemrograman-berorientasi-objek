/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan1;

/**
 *
 * @author USER
 */
public class MobilBeraksi {
    public static void main(String[]args){
        //membuat object dari class mobil
        Mobil mobilku=new Mobil();
        
        //mengisi atribut class
        mobilku.tahunProduksi=2009;
        mobilku.warna="Biru";
        
        //memanggil isi atributnya
        System.out.println("Warna Mobil:"+mobilku.warna);
        System.out.println("Tahun Mobil:"+mobilku.tahunProduksi);
    }
                
    }
