/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main3;

import java.util.Scanner;

/**
 *
 * @author Yuliana
 */
public class Kendaraan {
    //membuat static void kendaraan
    static void data(){
        //membuat scanner
        Scanner input = new Scanner(System.in);
        //membuat judul
        System.out.println("<<<     SILAHKAN MENGISI DATA KENDARAAN ANDA     >>>");
        System.out.println("====================================================");
        System.out.println("");
        
        //untuk menerima inputan user
        System.out.print("Masukkan jenis kendaraan              : ");
        String jenis = input.nextLine();
        System.out.print("Masukkan brand kendaraan              : ");
        String brand = input.nextLine();
        System.out.print("Masukkan type/model kendaraan         : ");
        String type = input.nextLine();
        System.out.print("Masukkan warna kendaraan              : ");
        String warna = input.nextLine();
        System.out.print("Masukkan tahun pembuatan kendaraan    : ");
        int tahun = input.nextInt();
        System.out.print("Masukkan cc kendaraan                 : ");
        int cc = input.nextInt();
        System.out.println("");
        
        //untuk menampilkan hasil output
        System.out.println("<<<         DATA KENDARAAN         >>>");
        System.out.println("======================================");
        System.out.println("");
        
        System.out.println("Jenis Kendaraan             : "+jenis);
        System.out.println("Brand Kendaraan             : "+brand);
        System.out.println("Type/Model Kendaraan        : "+type);
        System.out.println("Warna Kendaraan             : "+warna);
        System.out.println("Tahun Pembuatan Kendaraan   : "+tahun);
        System.out.println("CC Kendaraan                : "+cc);
    }
}
