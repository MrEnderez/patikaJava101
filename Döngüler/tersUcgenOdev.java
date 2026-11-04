import java.util.Scanner;

public class tersUcgenOdev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int sayi1 = input.nextInt();
        for (int i = 1; i <= sayi1; i++){
            for (int j = 1; j <= sayi1-i ; j++){
                System.out.print(("*"));
            }
            System.out.println();
        }
    }
}
