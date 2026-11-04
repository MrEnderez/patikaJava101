import java.util.Scanner;
public class minMaxOdev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç Adet Sayı Gireceksiniz: ");
        int sayiAdet=input.nextInt();
        int sayi1, min=sayiAdet, max=sayiAdet;
        for (int i = 1; i <= sayiAdet; i++) {
            System.out.print(i+". Sayıyı Giriniz: ");
            sayi1 = input.nextInt();
            if (sayi1<min) {
                min = sayi1;
            }
            else if (sayi1>max) {
                max = sayi1;
            }
        }
        System.out.println("MAX: "+max);
        System.out.println("MIN: "+min);
    }
}
