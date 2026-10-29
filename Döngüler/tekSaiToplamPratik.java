import java.util.Scanner;

public class tekSaiToplamPratik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi=0,toplam=0;
        while(sayi>=0){
            System.out.print("Sayı Giriniz: ");
            sayi = input.nextInt();
            if(sayi<0){
                break;
            }
            if(sayi%4==0){
                toplam+=sayi;
            }
        }
        System.out.println(toplam);
    }
}