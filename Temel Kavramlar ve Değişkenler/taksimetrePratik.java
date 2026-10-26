import java.util.Scanner;

public class taksimetrePratik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double acilisUcret= 10, kmBasina=2.20, gidilenYol;
        System.out.print("Gidilen Yolu KM Cinsinden Yazınız: ");
        gidilenYol = input.nextDouble();
        acilisUcret += (gidilenYol*kmBasina);
        if(acilisUcret>=20){
            System.out.println("Ödenecek Tutar: " + acilisUcret);
        }
        else{
            System.out.println("Ödenecek Tutar: " + 20);
        }
    }
}
