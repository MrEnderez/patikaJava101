import java.util.Scanner;

public class desenOdev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int n = input.nextInt();
        System.out.println(desen(n, n,true));
    }

    static String desen(int sayi,int sayi1,boolean azalma) {
        if (azalma == false) {
            if (sayi == sayi1) return sayi+" ";
            else  return sayi+" "+desen(sayi+5,sayi1,false);
        }
        else if (sayi <= 0) return desen(sayi,sayi1,false);
        return sayi + " " + desen(sayi - 5,sayi1,true);
    }
}