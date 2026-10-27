import java.util.Scanner;

public class cinZodyakOdev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yil, kalan;
        System.out.print("Doğdunuz Yılı Giriniz: ");
        yil = input.nextInt();
        kalan= yil % 12;
        switch(kalan){
            case 0:
                System.out.println("Çin Zodyağına Göre Burcunuz Maymun");
                break;
            case 1:
                System.out.println("Çin Zodyağına Göre Burcunuz Horoz");
                break;
            case 2:
                System.out.println("Çin Zodyağına Göre Burcunuz Köpek");
                break;
            case 3:
                System.out.println("Çin Zodyağına Göre Burcunuz Domuz");
                break;
            case 4:
                System.out.println("Çin Zodyağına Göre Burcunuz Fare");
                break;
            case 5:
                System.out.println("Çin Zodyağına Göre Burcunuz Öküz");
                break;
            case 6:
                System.out.println("Çin Zodyağına Göre Burcunuz Kaplan");
                break;
            case 7:
                System.out.println("Çin Zodyağına Göre Burcunuz Tavşan");
                break;
            case 8:
                System.out.println("Çin Zodyağına Göre Burcunuz Ejderha");
                break;
            case 9:
                System.out.println("Çin Zodyağına Göre Burcunuz Yılan");
                break;
            case 10:
                System.out.println("Çin Zodyağına Göre Burcunuz At");
                break;
            case 11:
                System.out.println("Çin Zodyağına Göre Burcunuz Koyun");

        }
    }
}
