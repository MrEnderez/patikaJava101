public class Course {

    String ad;
    int dersId;
    String kisaAD;
    Teacher Ogretmen;

    Course(String ad,int dersId,String kisaAD){
        this.ad=ad;
        this.dersId=dersId;
        this.kisaAD=kisaAD;
    }

    void addTeacher(Teacher Ogretmen){
        this.Ogretmen=Ogretmen;
    }

    void infoTeacher(Teacher Ogretmen){
        System.out.println("Öğretmen Ad: "+this.Ogretmen.ad);
        System.out.println("Öğretmen İD: "+this.Ogretmen.id);
        System.out.println("Brans: "+this.Ogretmen.brans);
    }
}
