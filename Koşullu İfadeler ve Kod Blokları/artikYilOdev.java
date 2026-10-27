import java.util.Scanner;

public class artikYilOdev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        System.out.printf("Yıl Giriniz: ");
        sayi = input.nextInt();
        if (sayi%100==0){
            if (sayi%400==0){
                System.out.println("Girdiğiniz Yıl Artık Yıldır");
            }
            else{
                System.out.println("Girdiğiniz Yıl Artık Yıl Değildir");
            }
        }
        else{
            if (sayi%4==0){
                System.out.println("Girdiğiniz Yıl Artık Yıldır");
            }
            else{
                System.out.println("Girdiğiniz Yıl Artık Yıl Değildir");
            }
        }
    }
}
