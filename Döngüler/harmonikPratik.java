package ders;

import java.util.Scanner;
public class harmonikPratik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sayi;
        System.out.print("Sayı Giriniz: ");
        sayi = input.nextDouble();
        double toplam=0.0;
        for(double i = sayi;i>0;i--){
            toplam+=(1/i);
        }
        System.out.println("Harmonik Seri Değeri: "+ toplam);
    }
}
