import java.util.Scanner;

public class dortVeBesKatPratik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        System.out.print("Sayı Giriniz: ");
        sayi = input.nextInt();
        System.out.print("4'ün Katları: ");
        for(int i=4;i<= sayi;i*=4) {
            System.out.print(i+",");
        }
        System.out.print("\n5'in Katları: ");
        for(int j=5;j<=sayi;j*=5) {
            System.out.print(j+",");
        }
    }
}
