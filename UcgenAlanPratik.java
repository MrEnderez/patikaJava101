import java.util.Scanner;

public class UcgenAlanPratik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kenarBir, kenarIki, kenarUc;
        System.out.print("Birinci Kenar Uzunluğunu Girin: ");
        kenarBir = input.nextInt();
        System.out.print("İkinci Kenar Iki Girin: ");
        kenarIki = input.nextInt();
        System.out.print("Üçkinci Kenar Uc Girin: ");
        kenarUc = input.nextInt();

        System.out.println("Üçgenin Kenar Uzunlukları: " + kenarBir + ", " + kenarIki + ", " + kenarUc);
        System.out.println("Alan Hesaplanıyor...");
        double ucgenCevre= (kenarBir+kenarIki+kenarUc)/2.0;
        double ucgenAlan = Math.sqrt(ucgenCevre*(ucgenCevre-kenarBir)*(ucgenCevre-kenarIki)*(ucgenCevre-kenarUc));
        System.out.println("Üçgen Alan: " + ucgenAlan);
    }
}