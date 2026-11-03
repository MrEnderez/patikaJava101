import java.util.Scanner;

public class bankaPratik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username,password;
        int deneme=0, islem, bakiye=3000, islemGorcekPara;
        while(deneme<3){
            System.out.print("Kullanıcı Adı Giriniz: ");
            username=input.nextLine();
            System.out.print("Şifre Giriniz: ");
            password=input.nextLine();
            if(username.equals("admin") && password.equals("admin")){
                System.out.println("Sisteme Hoşgeldiniz\n");
                System.out.print("1-Bakiye Sorgulama\n2-Para Yatırma\n3-Para Çekme\n4-Çıkış Yapmak\nYapmak İstediğiniz İşlemi Seçiniz: ");
                islem=input.nextInt();
                switch (islem){
                    case 1:
                        System.out.print("Bakiyeniz: "+ bakiye+"TL");
                        break;
                    case 2:
                        System.out.print("Yatırılacak Tutarı Giriniz: ");
                        islemGorcekPara=input.nextInt();
                        bakiye+=islemGorcekPara;
                        System.out.print("İşlem Başarılı Güncel Bakiyeniz: "+bakiye+"TL");
                        break;
                    case 3:
                        System.out.print("Çekilecek Tutarı Giriniz: ");
                        islemGorcekPara=input.nextInt();
                        if (islemGorcekPara>bakiye){
                            System.out.println("İŞLEM BAŞARISIZ(Girdiğiniz Tutar Bakiyenizden Yüksektir)");
                        }
                        else {
                            bakiye-=islemGorcekPara;
                            System.out.println("İşlem Başarılı Güncel Tutar: "+bakiye+"TL");
                        }
                        break;
                    case 4:
                        System.out.println("Sistemden Çıkış Yapılıyor...");
                        deneme+=3;
                        break;
                    default:
                        System.out.println("Yanlış İşlem Seçtiniz Çıkış Yapılıyor...");
                        break;
                }
                break;
            }
            else{
                deneme++;
                System.out.println("Kalan Deneme Hakkınız: " + (3-deneme));
            }
        }
    }
}
