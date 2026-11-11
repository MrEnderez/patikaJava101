import java.util.Scanner;

public class usHesabiOdev {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int alt = sc.nextInt();
        System.out.print("Kuvver Giriniz: ");
        int us = sc.nextInt();
        usHesabi(alt,us);
    }
    static void usHesabi(int n, int k) {
        long total = 1;
        for (int i = 1; i <= k; i++) total *= n;
        System.out.println("Sonuç: "+total);
    }
}