import java.util.Scanner;

public class mukemmelSayiOdev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int sayi1 = input.nextInt();
        int sayiToplam=0;
        for (int i = 1; i < sayi1; i++) {
            if(sayi1%i==0){
                sayiToplam+=i;
            }
        }
        if(sayiToplam==sayi1){
            System.out.println("Sayınız Mükemmel Sayıdır");
        }
        else{
            System.out.println("Sayınız Mükemmel Sayı Değildir");
        }
    }
}
