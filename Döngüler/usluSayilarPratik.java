import java.util.Scanner;

public class usluSayilarPratik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int as,üs,değer=1;
        System.out.print("Kuvveti Alınacak Sayıyı Giriniz: ");
        as = input.nextInt();
        System.out.print("Üssü Değeri Giriniz: ");
        üs = input.nextInt();
        for (int i = 1; i <= üs; i++) {
            değer *= as;
        }
        System.out.println(değer);
    }
}
