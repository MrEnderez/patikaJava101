import java.util.Scanner;

public class vucutKitleIndexOdev {
    public static void main(String[] args) {
    double kilo, boy, index;
    Scanner input = new Scanner(System.in);
        System.out.print("Kilonuzu KG Cinsinden Yazınız: ");
        kilo = input.nextDouble();
        System.out.print("Boyunuzu METRE(1,80 Gibi) Cinsinden Yazınız: ");
        boy = input.nextDouble();
        index = kilo/(boy*boy);
        System.out.println("Vucut Kitle İndeksiniz: " + index);
    }
}
