import java.util.Random;

public class Mac {
    Boksor b1;
    Boksor b2;
    Boksor winner;
    double kgAvg;

    Mac(Boksor b1, Boksor b2) {
        this.b1 = b1;
        this.b2 = b2;
        kgAvg = (this.b1.kilo+this.b2.kilo)/2;
    }

    boolean sikletHesap(){
        if (this.b1.kilo > (kgAvg-10) && this.b2.kilo > (kgAvg-10)&&this.b1.kilo < (kgAvg+10)&&this.b2.kilo < (kgAvg+10)) {
            return true;
        }
        return false;
    }

    void run() {
        if (!sikletHesap()) {
            System.out.println("Dövüşçülerin sıkletleri uyuşmuyor.");
            return;
        }
        System.out.println("Maç Başlıyor...\nHadi Boksörlerimizi Tanıyalım:\n");
        b1.boksorInfo();
        b2.boksorInfo();
        Boksor anlik = baslayan();
        while (b1.can > 0 && b2.can > 0) {
            Random r = new Random();
            int randomDodge;
            if (anlik == b1) {
                randomDodge = r.nextInt(100);
                if (randomDodge < b2.dodge) {
                    System.out.println("********************************************"+this.b2.ad + "\ngelen yumruğu atlattı!");
                } else {
                    b1.vur(b2);
                    winner();
                }
                anlik = b2;
            }
            else {
                randomDodge = r.nextInt(100);
                if (randomDodge < b1.dodge) {
                    System.out.println("********************************************\n"+this.b1.ad + " gelen yumruğu atlattı!");
                } else {
                    b2.vur(b1);
                    winner();
                }
                anlik = b1;
            }
        }
    }

    void winner(){
        if (this.b1.can<=0){
            this.winner = b2;
            System.out.println("Kazanan: "+this.winner.ad);
        }
        else if (this.b2.can <= 0){
            this.winner = b1;
            System.out.println("Kazanan: "+this.winner.ad);
        }
    }

    Boksor baslayan(){
        Random rand = new Random();
        int d = rand.nextInt(2);
        if (d==0){
            System.out.println("Dövüşe Başlayacak Boksör: "+ this.b1.ad+"\n--------------------------------------------");
            return b1;
        }
        else {
            System.out.println("Dövüşe Başlayacak Boksör: "+ this.b2.ad);
            return b2;
        }
    }
}
