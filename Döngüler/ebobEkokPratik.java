import java.util.Scanner;

public class ebobEkokPratik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1, sayi2, ebob=1;
        System.out.print("1. Sayı: ");
        sayi1 = input.nextInt();
        System.out.print("2. Sayı: ");
        sayi2 = input.nextInt();
        if(sayi1>sayi2){
            for (int i = 1; i <= sayi1; i++) {
                if (sayi1%i==0 && sayi2%i==0) {
                    ebob=i;
                }
            }
        }
        else if(sayi1<sayi2){
            for (int i = 1; i <= sayi2; i++) {
                if (sayi1%i==0 && sayi2%i==0) {
                    ebob=i;
                }
            }
        }
        else{
            ebob=sayi1;
        }
        int ekok= (sayi1*sayi2)/ebob;
        System.out.println("EBOB: "+ebob);
        System.out.println("EKOK: "+ekok);
    }
}
