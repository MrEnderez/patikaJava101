import java.util.Scanner;

public class kombinasyonHesapPratik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kume1, kume2,n=1,r=1,t,t2Fakt=1, kombinasyon;
        System.out.print("Kombinasyon İçin 1 Numaralı Küme Değerini Giriniz: ");
        kume1 = input.nextInt();
        System.out.print("Kombinasyon İçin 2 Numaralı Küme Değerini Giriniz: ");
        kume2 = input.nextInt();
        if(kume1>=kume2) {
            for (int i = kume1; i >= 1; i--) {
                n *= i;
            }
            for (int j = kume2; j >= 1; j--) {
                r *= j;
            }
            t = kume1 - kume2;
            for (int k = t; k >= 1; k--) {
                t2Fakt *= k;
            }
            kombinasyon = n / (r * t2Fakt);
            System.out.print(kombinasyon);
        }
        else {
            System.out.print("Birinci Değer İkinci Değerden Küçük Olamaz");
        }
    }
}