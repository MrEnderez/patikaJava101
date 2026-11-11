import java.util.Scanner;

public class gelismisHesapMakinePratik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int adet=0;
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n5-Üs Alma\n6-Faktoriyel\n7-Mod Alma\n8-Dikdörtgen Alan ve Çevre\n9-Çıkış Yapar");
        System.out.print("İşlem Seçiniz: ");
        int islem = input.nextInt();
        islem(islem);
    }
    static void islem(int islem) {
        Scanner input = new Scanner(System.in);
        int adet = 0;
        switch (islem) {
            case 1:
                System.out.print("Sayı Adedi Giriniz: ");
                adet = input.nextInt();
                System.out.println("Sonuç: " + toplama(adet));
                break;
            case 2:
                System.out.print("1. Sayı: ");
                int cikarmaSayi1 = input.nextInt();
                System.out.print("2. Sayı: ");
                int cikarmaSayi2 = input.nextInt();
                cikarma(cikarmaSayi1, cikarmaSayi2);
                break;
            case 3:
                System.out.print("Sayı Adedi Giriniz: ");
                adet = input.nextInt();
                System.out.println("Sonuç: " + carpma(adet));
                break;
            case 4:
                System.out.print("Bölünen: ");
                int bolunenSayi = input.nextInt();
                System.out.print("Bölen: ");
                int bolen = input.nextInt();
                bolme(bolunenSayi, bolen);
                break;
            case 5:
                System.out.print("Alt: ");
                int alt = input.nextInt();
                System.out.print("Üs: ");
                int us = input.nextInt();
                System.out.println("Sonuç: " + us(alt, us));
                break;
            case 6:
                System.out.print("Faktoriyeli Alınacak Sayı: ");
                int fakt = input.nextInt();
                System.out.println("Sonuç: " + fakt(fakt));
                break;
            case 7:
                System.out.print("1. Sayı: ");
                int sayi = input.nextInt();
                System.out.print("2.Sayı: ");
                int sayi2 = input.nextInt();
                mod(sayi, sayi2);
                break;
            case 8:
                System.out.print("Uzun Kenar: ");
                int uzun = input.nextInt();
                System.out.print("Kısa Kenar: ");
                int kisa = input.nextInt();
                dkt(uzun, kisa);
                break;
            default:
                System.out.println("Çıkış Yapılıyor");
        }
    }
    //Toplama İşlemi
    static int toplama(int sayi){
        Scanner input = new Scanner(System.in);
        int toplam=0;
        for (int i = 1; i <= sayi; i++) {
            System.out.print(i+". Sayı: ");
            int sayi2= input.nextInt();
            toplam+=sayi2;
        }
        return toplam;
    }
    //Çıkarma İşlemi
    static void cikarma(int sayi,int sayi2){
        System.out.print("Sonuç: "+(sayi-sayi2));
    }
    //Çarpma İşlemi
    static int carpma(int sayi){
        Scanner input = new Scanner(System.in);
        int carpma=1;
        for (int i = 1; i <= sayi; i++) {
            System.out.print(i+". Sayı: ");
            int sayi2= input.nextInt();
            carpma*=sayi2;
        }
        return carpma;
    }
    //Bolme İşlemi
    static void bolme(int sayi,int sayi2){
        System.out.println("Bölüm: "+(sayi/sayi2));
        System.out.println("Kalan: "+(sayi%sayi2));
    }
    //Üs Alma
    static int us(int as,int us){
        if (us==0) return 1;
        if (us==1) return as;
        return as*us(as,us-1);
    }
    //Faktoriyel
    static long fakt(int sayi){
        if (sayi==0) return 1;
        return sayi*fakt(sayi-1);
    }
    //Mod Alma
    static void mod(int sayi,int sayi2){
        System.out.println("Sonuç: "+ (sayi%sayi2));
    }
    //Dikdortgen
    static void dkt(int uzun,int kisa){
        System.out.println("Çevresi: "+((2*uzun)+(2*kisa)));
        System.out.println("Alan: "+ (uzun*kisa));
    }
}
