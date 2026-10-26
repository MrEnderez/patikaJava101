import java.util.Scanner;

public class hesapMakinesiPratik {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi1,sayi2, islemler, sonuc;
        System.out.print("Birinci Sayıyı Giriniz: ");
        sayi1 = scan.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        sayi2 = scan.nextInt();
        System.out.print("(+=1)\n(-=2)\n(*=3)\n(/=4)\n(%=5)\nİşlemi Giriniz: ");
        islemler = scan.nextInt();
        switch(islemler) {
            case 1:
                sonuc = sayi1 + sayi2;
                System.out.println("İşlem Sonucu: "+sonuc);
                break;
            case 2:
                sonuc = sayi1 - sayi2;
                System.out.println("İşlem Sonucu: "+sonuc);
                break;
            case 3:
                sonuc = sayi1 * sayi2;
                System.out.println("İşlem Sonucu: "+sonuc);
                break;
            case 4:
                sonuc = sayi1 / sayi2;
                System.out.println("İşlem Sonucu: "+sonuc);
                break;
            case 5:
                sonuc = sayi1 % sayi2;
                System.out.println("İşlem Sonucu: "+sonuc);
                break;
            default:
                System.out.println("Lütfen Belirtilen İşlemler Dışında Seçim Yapmayınız");
        }
    }
}