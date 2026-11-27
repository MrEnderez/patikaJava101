import java.util.Random;

public class Boksor {
    String ad;
    int can;
    int hasar;
    int  kilo;
    int dodge;

    Boksor(String ad, int can, int hasar, int kilo,int dodge) {
        this.ad = ad;
        this.can = can;
        this.hasar = hasar;
        this.kilo = kilo;
        if(dodge <=100&&dodge >0) this.dodge = dodge;
        else this.dodge = 0;
    }

    void boksorInfo() {
        System.out.println("Ad: " + this.ad);
        System.out.println("Can: " + this.can);
        System.out.println("Hasar: " + this.hasar);
        System.out.println("Kilo: " + this.kilo);
        System.out.println("--------------------------------------------");
    }

    void vur(Boksor rakip){
        System.out.println("********************************************");
        if (rakip.can<=0){
            rakip.can = 0;
        }
        else rakip.can -= this.hasar;
        if (rakip.can>0) System.out.println(this.ad+"==>"+rakip.ad+"==>"+this.hasar+" Damage\n"+rakip.ad+" Can: "+rakip.can);
        if (rakip.can<=0) System.out.println(this.ad+"==>"+rakip.ad+"==>"+this.hasar+" Damage\n"+rakip.ad+" Can: " + 0);
    }

}
