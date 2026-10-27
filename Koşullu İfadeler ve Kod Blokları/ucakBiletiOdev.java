import java.util.Scanner;

public class ucakBiletiOdev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yas, gdns;
        double yol, fiyat;
        System.out.print("Gidiceğiniz Yolu KM Cinsinden Giriniz: ");
        yol = input.nextInt();
        System.out.print("Yaşınızı Giriniz: ");
        yas = input.nextInt();
        System.out.print("Yolculuk Tipini Seçin(1 => Tek Yön, 2 => Gidiş Dönüş): ");
        gdns = input.nextInt();
        fiyat = yol*0.10;
        if (yas>0 && yas<12){
            fiyat /= 2;
            if (gdns==1){
                System.out.println(fiyat+"TL");
            }
            else if (gdns==2){
                fiyat = (2 * fiyat) * 0.8;
                System.out.println(fiyat+"TL");
            }
            else{
                System.out.println("Geçersiz Veri Girişi");
            }
        }
        if (yas>=12 && yas<24){
            fiyat= fiyat-(fiyat*0.1);
            if (gdns==1){
                System.out.println(fiyat+"TL");
            }
            else if (gdns==2){
                fiyat = (2 * fiyat) * 0.8;
                System.out.println(fiyat+"TL");
            }
            else{
                System.out.println("Geçersiz Veri Girişi");
            }
        }
        if (yas>65){
            fiyat = fiyat-(fiyat*0.3);
            if (gdns==1){
                System.out.println(fiyat+"TL");
            }
            else if (gdns==2){
                fiyat = (2 * fiyat) * 0.8;
                System.out.println(fiyat+"TL");
            }
            else{
                System.out.println("Geçersiz Veri Girişi");
            }
        }
        else if (yas>=24&&yas<65){
            if (gdns==1){
                System.out.println(fiyat+"TL");
            }
            else if (gdns==2){
                fiyat = (2 * fiyat) * 0.8;
                System.out.println(fiyat+"TL");
            }
            else{
                System.out.println("Geçersiz Veri Girişi");
            }
        }
    }
}
