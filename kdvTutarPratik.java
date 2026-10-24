import java.util.Scanner;

public class kdvTutarPratik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kdvsizFiyat;
        double kdvTutari = 0.0;
        double kdvliFiyat;
        System.out.print("Ürün Fiyatı Giriniz: ");
        kdvsizFiyat = input.nextDouble();
        if (kdvsizFiyat < 1000) {
            kdvTutari = kdvsizFiyat * 0.18;
        }
        else if (kdvsizFiyat >= 1000) {
            kdvTutari = kdvsizFiyat * 0.08;
        }
        kdvliFiyat = kdvTutari + kdvsizFiyat;

        System.out.println("Kdv'siz Tutar: " + kdvsizFiyat);
        System.out.println("Kdv'li Tutar: " + kdvliFiyat);
        System.out.println("Kdv Tutarı: " + kdvTutari);
    }
}
