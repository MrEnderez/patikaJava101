import java.util.Scanner;

public class asalSayiBulucu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int sayi = input.nextInt();
        boolean sonuc = asalSayiBul(sayi,2);
        if(sonuc) System.out.println("Asaldır");
        else System.out.println("Değildir");
    }
    static boolean asalSayiBul(int sayi, int bolen) {
        if (sayi <= 1) return false;
        if (sayi == bolen) return true;
        if (sayi % bolen == 0) return false;
        return asalSayiBul(sayi, bolen + 1);
    }
}