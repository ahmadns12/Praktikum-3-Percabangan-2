/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.altriaa.praktikum3_2;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Praktikum3_2 {

    public static void main(String[] args) {
        int h; // h = Hari
        double p,e,s; // p = Pendapatan, e = Estimasi, s = Selisih
        Scanner sc = new Scanner(System. in);
        
        System.out.println("Input your Day");
        h = sc.nextInt();
        
        System.out.println("Input your Income");
        p = sc.nextDouble();
        e = 3 * (h * h) + (5 * h) + 200;
        s = p - e;
        if(p > e && s > 0.5){
            System.out.println("Estimasi pendapatan pada hari ke " + h + " adalah: " + e +
                    " Di atas estimasi Dan pendapatan sebenarnya "
                    + "adalah: " + p + " Serta selisihnya adalah: " + s);
        }
        else if(p < e && s < 0.5){
            System.out.println("Estimasi pendapatan pada hari ke " + h + " adalah: " + e + 
                    " Di bawah estimasi Dan pendapatan sebenarnya "
                    + "adalah: " + p + " Serta selisihnya adalah: " + s);
        }
        else if(s <= 0.5){
            System.out.println("Estimasi pendapatan pada hari ke " + h + " adalah: " + e + 
                    " Sesuai estimasi Dan pendapatan sebenarnya "
                    + "adalah: " + p + " Serta selisihnya adalah: " + s);
        }
        else{
            System.out.println("Maaf kami tidak bisa mendeteksi kriteria "
                    + "estimasi yang anda masukkan!");
        }
    }
}
