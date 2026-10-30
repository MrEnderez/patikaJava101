import java.util.Scanner;

public class armstrongSayiPratik {
    public static void main(String[] args) {
        int sayi1, basamakSayi = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        sayi1 = input.nextInt();

        int sayi2 = sayi1;
        while (sayi2 != 0) {
            sayi2 /= 10;
            basamakSayi++;
        }

        sayi2 = sayi1;
        int toplam = 0, temp = sayi1, basamaklarToplamı=0;
        System.out.println("Basamak Sayısı: " + basamakSayi);

        while (sayi1 != 0) {
            int sayiUsCarpim = 1;
            sayi2 = sayi1 % 10;
            for (int i = 1; i <= basamakSayi; i++) {
                sayiUsCarpim *= sayi2;
            }
            basamaklarToplamı +=sayi2;
            toplam += sayiUsCarpim;
            sayi1 /= 10;
        }
        System.out.println("Basamak Değerleri Toplamı: "+basamaklarToplamı);
        if (toplam == temp) {
            System.out.println("Sayı Armstrong Sayıdır");
        } else {
            System.out.println("Sayı Armstrong Sayı Değildir");
        }

    }
}