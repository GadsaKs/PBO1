/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salary;

import penggajian.*;
import java.util.Scanner;

/**
 *
 * @author gadsa
 */
public class Salary {
    
    public static void main(String[] args) {
        
        karyawan saya = new karyawan("01010","Ramdhani","0900900909","BJM TENGAH");
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan NIK Pegawai : ");
        saya.inputNIK(input.nextLine());
        System.out.print("Masukkan Nama Pegawai : ");
        saya.inputNAMA(input.nextLine());
        System.out.print("Masukkan TELP Pegawai : ");
        saya.inputTELP(input.nextLine());
        System.out.print("Masukkan Alamat Pegawai : ");
        saya.inputALAMAT(input.nextLine());
        System.out.print("Masukkan Golongan Pegawai : ");
        saya.inputGolongan(input.nextLine());
        System.out.print("Masukkan Status Nikah(Menikah/Belum) Pegawai : ");
        saya.inputStatusNikah(input.nextLine());
        
        if (saya.getStatus().equals("Menikah")){
            System.out.print("Masukkan Jumlah Anak Pegawai : ");
            saya.inputJumlahAnak(input.nextInt());
        }else {
            saya.inputJumlahAnak(0);
        }
        
        System.out.print("Masukkan Masa Kerja Pegawai : ");
        saya.inputMasaKerja(input.nextInt());
        System.out.print("==========================================");
        System.out.print("Gaji Total Diterima : "+saya.gajiTotal());
        
        }
}
