package admin;

import admin.KitapIslemleri.KitapMenusu;
import admin.KullaniciIslemleri.KullaniciMenusu;
import genel.Cikis;
import genel.IlkGiris;
import genel.Renklendirme;

import java.sql.SQLException;
import java.util.Scanner;

public class AdminMenusu {
    /*
        ***Admin Menüsü***
        1-Kullanıcı İşlemleri
        2-Kitap İşlemleri
        0-Çıkış
        *
         switch-case ile bakalım
         1 ise KullanıcıMenüsü ne gitsin
         2- ise KitapMenusune gitsin
         0- çıkış
         yanlış giriş yaparsa da uyarı verip tekrar admin menüsünü çağıralım.
     */
    public static void adminMenusuMethodu() throws InterruptedException, SQLException, ClassNotFoundException {

        System.out.println(Renklendirme.ANSI_BLUE + "========================================" + Renklendirme.ANSI_RESET);
        System.out.println(Renklendirme.ANSI_GREEN + "-----Admin Menüsü-----" + Renklendirme.ANSI_RESET);
        System.out.println("1-->Kullanıcı İşlemleri\n"+"2-->Kitap İşlemleri\n"+"9-->Üst Menü\n"+"0-->Çıkış");

        Scanner scan = new Scanner(System.in);
        System.out.print("Gitmek istediğiniz menünün sıra numarasını giriniz :");
        String secim = scan.next();


        switch (secim){
            case "1":
                KullaniciMenusu.adminKullaniciIslemleriMenusuMethodu();
                break;
            case "2":
                KitapMenusu.adminKitapMenusuMethodu();
                break;
            case "0": Cikis.cikisMethodu();
                break;
            case "9":
                IlkGiris.ilkGirisMethodu();
                break;

            default:
                System.out.println("Lütfen geçerli bir giriş yapınız!");
                adminMenusuMethodu();
                break;
        }


    }

}
