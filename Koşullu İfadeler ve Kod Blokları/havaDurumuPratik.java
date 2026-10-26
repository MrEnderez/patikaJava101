import  java.util.Scanner;

public class havaDurumuPratik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int derece;
        System.out.print("Hava Durumunu Derece Cinsinden Yazınız: ");
        derece = input.nextInt();

        if(derece<5){
            System.out.println("Kayak Yapmalısın");
        }
        else  if(derece>5 && derece<=15){
            System.out.println("Sinemaya Gitmelisin");
        }
        else if(derece>15 && derece<=25){
            System.out.println("Piknik Yapmalısın");
        }
        else{
            System.out.println("Yüzmeye Gitmelisin");
        }
    }
}