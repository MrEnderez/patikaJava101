import java.util.Scanner;

public class fibonacciOdev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int seri = input.nextInt();
        int sayi1=0;
        int sayi2=1;
        int toplam;
        for(int i=1;i<seri;i++){
            toplam=sayi1+sayi2;
            System.out.println(sayi1+"+"+sayi2+"="+toplam);
            sayi1=sayi2;
            sayi2=toplam;
        }
    }
}