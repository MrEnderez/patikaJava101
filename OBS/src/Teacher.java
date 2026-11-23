public class Teacher {

    String ad;
    int id;
    String brans;

    Teacher(String ad, int id, String brans) {
        this.ad = ad;
        this.id = id;
        this.brans = brans;
    }

    void info(){
        System.out.println("Öğretmen Ad: "+this.ad);
        System.out.println("Öğretmen İD: "+this.id);
        System.out.println("Brans: "+this.brans);
    }
}