/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alfi Nurizkya
 * Nama  : ALFI NURIZKYA
 * Kelas : IF-1
 * NIM   : 10119036
 * Deskripsi Program : Program Memasukkan Waktu
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class IF110119036Latihan26 {

    /**
     * @param args the command line arguments
     */
   static Date date = new Date();
    static Locale lokal = Locale.forLanguageTag("id");
    static SimpleDateFormat formatter = new SimpleDateFormat("EEEE, dd MMM yyyy HH:mm:ss", lokal);

    private static void tampilWaktu(){
        System.out.println("Hari ini adalah hari : " + formatter.format(date));
    }
 
    public static void main(String[] args) {
        tampilWaktu();
        System.out.println("Developed by : Alfi Nurizkya");
    }
}
