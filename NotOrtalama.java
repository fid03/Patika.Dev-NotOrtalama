package patikaDev;

import java.util.Scanner;

public class NotOrtalama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Matamatik notunuzu giriniz..");
        int mat = sc.nextInt();
        System.out.println("Fizik notunuzu giriniz..");
        int fizik = sc.nextInt();
        System.out.println("Kimya notunuzu giriniz..");
        int kimya = sc.nextInt();
        System.out.println("Turkce notunuzu giriniz..");
        int turkce = sc.nextInt();
        System.out.println("Tarih notunuz giriniz..");
        int tarih = sc.nextInt();
        System.out.println("Muzik notunuzu giriniz..");
        int muzik = sc.nextInt();
        double ortalama = (mat + fizik + kimya + turkce + tarih + muzik) / 6;
        System.out.println("Ortalamaniz:" + ortalama);
        String sonuc = ortalama > 60 ? "Sinifi gectiniz" : "Sinifda kaldiniz";
        System.out.println("SONUC:" + sonuc);
    }
}
