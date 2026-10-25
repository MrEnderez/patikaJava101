import java.util.Scanner;

public class manavKasaOdev {
    public static void main(String[] args) {
        double armut= 2.14, elma= 3.67, domates= 1.11, muz= 0.95, patlican= 5.00;
        double armut2,elma2,domates2,muz2,patlican2;
        Scanner scan = new Scanner(System.in);

        System.out.print("Kaç KG Armut Aldınız(Almadıysanız 0 Giriniz): ");
        armut2= scan.nextInt();
        System.out.print("Kaç KG Elma Aldınız(Almadıysanız 0 Giriniz): ");
        elma2= scan.nextInt();
        System.out.print("Kaç KG Domates Aldınız(Almadıysanız 0 Giriniz): ");
        domates2= scan.nextInt();
        System.out.print("Kaç KG Muz Aldınız(Almadıysanız 0 Giriniz): ");
        muz2= scan.nextInt();
        System.out.println("Kaç KG Patlican Aldınız(Almadıysanız 0 Giriniz): ");

        patlican2= scan.nextInt();
        armut2 = armut2*armut;
        elma2 = elma2*elma;
        domates2 = domates2*domates;
        muz2 = muz2*muz;
        patlican2 = patlican2*patlican;
        double toplam = armut2 + elma2 + domates2 + muz2 + patlican2;

        System.out.println( "\n******FİŞ******");
        System.out.println("Armut: " +  armut2);
        System.out.println("Elma: " +  elma2);
        System.out.println("Domates: " +  domates2);
        System.out.println("Muz: " +  muz2);
        System.out.println("Patlican: " +  patlican2);
        System.out.println("--------------------------------------");
        System.out.println("Toplam Tutar : "+toplam);
    }
}