public class Employee {
    String ad;
    double maas;
    int calismaSaat;
    int baslangicYil;
    double vergi,bonus,zam;
    double maas2;

    Employee(String ad,double maas,int calismaSaat,int baslangicYil){
        this.ad=ad;
        this.maas=maas;
        this.calismaSaat=calismaSaat;
        this.baslangicYil=baslangicYil;
        maas2=maas;
    }

    void info(){
        System.out.print("Ad: "+this.ad+"\nMaas: "+this.maas+
                "\nBaslangic Yil: "+this.baslangicYil+"\nÇalıştığı Saat: "+this.calismaSaat+
                "\nVergi: "+this.vergi+"\nBonus: "+this.bonus+"\nMaaş Artış Tutarı: "+this.zam+
                "\nVergi ve Bonuslar Ile Birlikte Maaş: " + (this.maas-this.vergi+this.bonus)+"\nToplam Maaş: "+ this.maas2);
    }
    void vergiHesapla(){
        if (this.maas>0){
            if(this.maas>1000){
                this.vergi=this.maas*0.03;
                this.maas2-=this.vergi;
            }
        }
        else System.out.println("Maas Eksi Birim Olamaz");
    }
    void bonus(){
        if (this.maas>0){
            if (this.calismaSaat>40){
                this.bonus=((this.calismaSaat-40)*30);
                this.maas2+=this.bonus;
            }
        }
        else System.out.println("Maas Eksi Birim Olamaz");
    }
    void zam(){
        int calistigiYil=2021-this.baslangicYil;
        if (this.maas>0){
            if (calistigiYil<10){
                this.zam=(this.maas*0.05);
                this.maas2+=this.zam;
            }
            else if (calistigiYil<20&& calistigiYil>9){
                this.zam=(this.maas*0.1);
                this.maas2+=this.zam;
            }
            else if  (calistigiYil>19){
                this.zam=(this.maas*0.15);
                this.maas2+=this.zam;
            }
            else if  (calistigiYil<0){
                System.out.println("Çalıştığı Yıl 0'dan Küçük Olamaz");
            }
        }
        else System.out.println("Maas Eksi Birim Olamaz");
    }
}
