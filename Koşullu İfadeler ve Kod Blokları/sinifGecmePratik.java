import java.util.Scanner;

public class sinifGecmePratik {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int mat, fizik, turkce, kimya, muzik;
        double avg=0;

        System.out.print("Matematik notunuz: ");
        mat=sc.nextInt();
        if(mat>=0 && mat<=100){
            avg=+mat;
        }

        System.out.print("Fizik notunuz: ");
        fizik=sc.nextInt();
        if(fizik>=0 && fizik<=100){
            avg+=fizik;
        }

        System.out.print("Kimya notunuz: ");
        kimya=sc.nextInt();
        if(kimya>=0 && kimya<=100){
            avg+=kimya;
        }

        System.out.print("Turkce notunuz: ");
        turkce=sc.nextInt();
        if(turkce>=0 && turkce<=100){
            avg+=turkce;
        }

        System.out.print("Muzik notunuz: ");
        muzik=sc.nextInt();
        if(muzik>=0 && muzik<=100) {
            avg += muzik;
        }
        avg/=5;
        System.out.println("Ortalamanız: "+avg);
        if (avg>=55){
            System.out.println("Geçtiniz");
        }
        else{
            System.out.println("Kaldınız");
        }
    }
}