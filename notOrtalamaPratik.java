import java.util.Scanner;

public class notOrtalamaPratik {
    public static void main(String[] args) {
        int mat,fizik, turkce, kimya, muzik, tarih;
        Scanner notes = new Scanner(System.in);
        System.out.print("Matematik notunuz: ");
        mat = notes.nextInt();
        System.out.print("Fizik notunuz: ");
        fizik = notes.nextInt();
        System.out.print("Kimya notunuz: ");
        kimya = notes.nextInt();
        System.out.print("Tarih notunuz: ");
        tarih = notes.nextInt();
        System.out.print("Muzik notunuz: ");
        muzik = notes.nextInt();
        System.out.print("Turkce notunuz: ");
        turkce = notes.nextInt();

        double sum= mat+fizik+kimya+tarih+muzik+turkce;
        double ortalama = sum/6;
        System.out.println("Ortalama: " + ortalama);
        if (ortalama >= 50) {
            System.out.println("Tebrikler Geçtiniz");
        }
        else {
            System.out.println("Seneye Görüşmek Üzere");
        }
    }
}
