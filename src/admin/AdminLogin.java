package admin;

import admin.KullaniciIslemleri.KullaniciEkle;
import genel.Renklendirme;

import java.util.Scanner;

public class AdminLogin {

    /*
    GİRİŞ EKRANI
    Kullanıcı ADı : sabit  veritabanından
    Şifre         : sabit veritabanından

    ilk etapta 1 1 seçebilirz.
    en son şifre kontrolü olabilir
    login olduğunda adminMenusune gitsin.

    deneme yapiyoruz
     */
    public static void adminLoginMethodu() throws InterruptedException {

        String adminAdi = "1";
        String adminSifre = "1";
        Scanner scan = new Scanner(System.in);
        System.out.println(Renklendirme.ANSI_BLUE + "========================================" + Renklendirme.ANSI_RESET);
        System.out.println(Renklendirme.ANSI_GREEN + "-----Admin Login Ekranı-----  " + Renklendirme.ANSI_RESET);
        System.out.print("Kullanıcı Adı :");
        String giris1 = scan.nextLine();
        System.out.print("Kullanıcı şifresi :");
        String giris2 = scan.next();

        if (adminAdi.equals(giris1) && adminSifre.equals(giris2))
        {
           AdminMenusu.adminMenusuMethodu();
        }
        else
        {
            System.out.println("Şifre veya kullanıcı adı hatalı,tekrar deneyiniz");
            adminLoginMethodu();
        }




    }




}
