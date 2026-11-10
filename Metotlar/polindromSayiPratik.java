import java.util.Scanner;

public class polindromSayiPratik {
    static boolean polindromSayisi(int sayi){
        int ters=0, sayi2=sayi;
        while(sayi!=0) {
            ters = ters * 10 + sayi % 10;
            sayi /= 10;
        }
        return ters == sayi2;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int sayi = input.nextInt();
        if(polindromSayisi(sayi)) System.out.println("Girilen Sayı Polindromdur");
        else System.out.println("Girilen Sayı Polindrom Değildir");
    }
}
