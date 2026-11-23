public class Ogrenci {

    String ad;
    int no;
    String sinif;
    Course course;
    double ortalama;
    boolean gectiMi;
    int sinavNot;
    int sozluNot;
    double sozluEtkisi;

    Ogrenci(String ad, int no,String sinif,Course course){
        this.ad = ad;
        this.no = no;
        this.sinif = sinif;
        this.course = course;
    }

    void notGir(int sinavNot, int sozluNot){
        if(sinavNot<=100&&sozluNot<=100&&sinavNot>0&&sozluNot>0) {
            this.sinavNot = sinavNot;
            this.sozluNot = sozluNot;
        }
    }

    void ortalama(double sozluEtkisi){
        this.sozluEtkisi=sozluEtkisi/100;
        double sinavEtkisi = (100-sozluEtkisi)/100;
        if(this.sozluEtkisi<=100&&this.sozluEtkisi>=0){
            System.out.println("Sinav Notu: "+this.sinavNot);
            double sinavOrtEtki=this.sinavNot*sinavEtkisi;
            System.out.println("Sözlü Notu: "+this.sozluNot);
            double sozluOrtEtki=this.sozluNot*this.sozluEtkisi;
            System.out.println("Sınav Notunun Ortalama Kattığı: "+sinavOrtEtki);
            System.out.println("Sozlu Notunun Ortalama Kattığı: "+sozluOrtEtki);
            this.ortalama=sozluOrtEtki+sinavOrtEtki;
            System.out.println("Ortalama: "+this.ortalama);
        }
        else System.out.println("Sozlu Etkisi 1 ile 100 Arasında Olmalıdır");
    }

    void gectiMi(){
        if(this.ortalama>50) {
            System.out.print("Dersi Başarıyla Geçtiniz");
            this.gectiMi=true;
        }
        else {
            System.out.print("Maalesef Dersi Geçemediniz");
            this.gectiMi=false;
        }
    }

    void info(){
        System.out.print("Öğrenci Ad: "+this.ad+"\nÖğretmen Ad: "+this.course.Ogretmen.ad+"\nSınav Notu: "+this.sinavNot+"\nSözlü Notu: "+this.sozluNot
        +"\nOrtalama: "+this.ortalama+"\nGeçti mi: ");
        gectiMi();
    }
}
