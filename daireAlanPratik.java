import java.util.Scanner;

public class daireAlanPratik {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double pi= 3.14;
        double yaricap, aci, alan, cevre;
        System.out.print("Yarıçap Uzunluğu Kaç CM'dir: ");
        yaricap = input.nextDouble();
        cevre = yaricap*pi*2;
        System.out.println("Daire Çevresi: " + cevre);
        System.out.print("Alan Hesaplaması İçin Açı Girilmesi Gerekmektedir(Bütün Daire Alanı İçin 360 Yazınız): ");
        aci = input.nextDouble();
        if (aci<360&&aci>0){
            alan = (pi*(yaricap*yaricap)*aci)/360;
            System.out.print("Alan: "+alan);
        }
        else{
            System.out.println("Hata: Açı 0 ve 360 Arasında Olmalıdır");
        }
    }
}