import java.util.Scanner;

public class userGirişPratik {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userName, password,usr2, psw2,newPassword;
        byte psw;
        System.out.println("**********KAYIT OLUNUZ**********");
        System.out.print("\t\tKullanıcı Adınız: ");
        userName = scan.nextLine();
        System.out.print("\t\tŞifre Giriniz: ");
        password = scan.nextLine();
        System.out.println("\n\n\n**********Giriş Yapınız**********");
        System.out.print("\t\tKullanıcı Adınız: ");
        usr2 = scan.nextLine();
        System.out.print("\t\tŞifre Giriniz: ");
        psw2 = scan.nextLine();
        if (userName.equals(usr2) && password.equals(psw2)) {
            System.out.println("\t***Giriş Yapıldı***");
        }
        else {
            System.out.print("Şifreniz Hatalı (Yeni Şifre Oluşturmak İçin 1 Sistemden Çıkmak İçin 0'ı Tuşlayınız): ");
            psw = scan.nextByte();
            scan.nextLine();
            if (psw == 1) {
                System.out.print("Yeni Şifreniz: ");
                newPassword = scan.nextLine();
                if (newPassword.equals(password)) {
                    System.out.println("Yeni Şifreniz Eskisi İle Aynı Olamaz");
                }
                else {
                    System.out.println("Başarılı Sisteme Giriş Yapmak İçin Programı Yeniden Başlatınız.");
                }
            }
            else{
                System.out.println("Sistemden Çıkılıyor...");
            }
        }
    }
}