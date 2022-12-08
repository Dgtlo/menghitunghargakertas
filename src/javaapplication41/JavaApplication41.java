/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication41;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class JavaApplication41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String printer,ukuran;
        int lembar,total,A4,F4;
        System.out.print("Masukkan jenis printer = ");
        printer = a.next();
        System.out.print("Masukkan Jumlah Kertas = ");
        lembar = a.nextInt();
        System.out.print("Masukkan Ukuran Kertas = ");
        ukuran = a.next();
        if ("hitam".equalsIgnoreCase(printer))
        {
            if (lembar<=50&&lembar>0)
            {
                if ("A4".equalsIgnoreCase(ukuran))
                {
                    A4 = 1000;
                    total = A4*lembar;
                    System.out.println("Total harga = Rp."+total);
                }
                else if ("F4".equalsIgnoreCase(ukuran))
                {
                    F4 = 1250;
                    total = F4*lembar;
                    System.out.println("Total harga = Rp."+total);
                }
                else
                {
                    System.out.println("Ukuran tidak tersedia");
                }
            }
            else if (lembar>50)
            {
                if ("A4".equalsIgnoreCase(ukuran))
                {
                    A4 = 750;
                    total = A4*lembar;
                    System.out.println("Total harga = Rp."+total);
                }
                else if ("F4".equalsIgnoreCase(ukuran))
                {
                    F4 = 1000;
                    total = F4*lembar;
                    System.out.println("Total harga = Rp."+total);
                }
                else
                {
                    System.out.println("Ukuran tidak tersedia");
                }
            }
            else
            {
                System.out.println("Inputan (Jumlah Printer) Tidak Boleh Mines");
            }
        }
        else if ("warna".equalsIgnoreCase(printer))
        {
            if (lembar<=30&&lembar>0)
            {
                if ("A4".equalsIgnoreCase(ukuran))
                {
                    A4 = 1500;
                    total = A4*lembar;
                    System.out.println("Total harga = Rp."+total);
                }
                else if ("F4".equalsIgnoreCase(ukuran))
                {
                    F4 = 1750;
                    total = F4*lembar;
                    System.out.println("Total harga = Rp."+total);
                }
                else
                {
                    System.out.println("Ukuran tidak tersedia");
                }
            }
            else if (lembar>30)
            {
                if ("A4".equalsIgnoreCase(ukuran))
                {
                    A4 = 1100;
                    total = A4*lembar;
                    System.out.println("Total harga = Rp."+total);
                }
                else if ("F4".equalsIgnoreCase(ukuran))
                {
                    F4 = 1550;
                    total = F4*lembar;
                    System.out.println("Total harga = Rp."+total);
                }
                else
                {
                    System.out.println("Ukuran tidak tersedia");
                }
            }
            else
            {
                System.out.println("Inputan (Jumlah Printer) Tidak Boleh Mines");
            }
        }
        else if ("gambar".equalsIgnoreCase(printer))
        {
            if (lembar<=20&&lembar>0)
            {
                if ("A4".equalsIgnoreCase(ukuran))
                {
                    A4 = 2000;
                    total = A4*lembar;
                    System.out.println("Total harga = Rp."+total);
                }
                else if ("F4".equalsIgnoreCase(ukuran))
                {
                    F4 = 2250;
                    total = F4*lembar;
                    System.out.println("Total harga = Rp."+total);
                }
                else
                {
                    System.out.println("Ukuran tidak tersedia");
                }
            }
            else if (lembar>20)
            {
                if ("A4".equalsIgnoreCase(ukuran))
                {
                    A4 = 1700;
                    total = A4*lembar;
                    System.out.println("Total harga = Rp."+total);
                }
                else if ("F4".equalsIgnoreCase(ukuran))
                {
                    F4 = 2100;
                    total = F4*lembar;
                    System.out.println("Total harga = Rp."+total);
                }
                else
                {
                    System.out.println("Ukuran tidak tersedia");
                }
            }
            else
            {
                System.out.println("Inputan (Jumlah Printer) Tidak Boleh Mines");
            }
        }
        else
        {
            System.out.println("Jenis printer tidak tersedia");
        }
    }
    
}
