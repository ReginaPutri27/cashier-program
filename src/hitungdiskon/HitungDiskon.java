/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitungdiskon;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class HitungDiskon {

    public static void main(String[] args) { 
        
        System.out.println("-- TOKO SERBA ADA -- \n");
        Scanner inputan = new Scanner(System.in);
        System.out.print("Nama Barang: ");
        String nama = inputan.nextLine();
        
        System.out.print("Harga Barang: Rp. ");
        int harga = inputan.nextInt();
        
        System.out.print("Banyak Barang: ");
        int barang = inputan.nextInt();
        
        int total = harga*barang;
        System.out.println("Jumlah Harga: Rp. " +total);
        
        if (total >=300000){
            int potongan1 = (total - (total*20/100));
            System.out.println("Total Bayar(Diskon20%) : Rp. " +potongan1);
        }else if(total >=500000){
            int potongan2 = (total - (total*30/100));
            System.out.println("Total Bayar(Diskon30%) : Rp. " +potongan2);
        }else{
            System.out.println("Total Bayar : " +total);
        }
        
        
        
    }
    
}
