import java.util.Scanner;

public class ciftSayiBulucuPratik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1;
        System.out.print("Sayı Giriniz(O Sayıya Kadar Olan Çift Sayılar Ekrana Yazılacaktır): ");
        sayi1 = input.nextInt();
        for (int i = 0; i <= sayi1; i=i+2) {
            System.out.print(i+",");
        }
        System.out.println();
        for (int j = 1; j <= sayi1; j++) {
            if(j%3==0){
                System.out.print(j+",");
            }
        }
        System.out.println();
        for(int k = 1; k <= sayi1; k++) {
            if(k%4==0){
                System.out.print(k+",");
            }
        }
    }
}