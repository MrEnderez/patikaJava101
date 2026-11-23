public class Main {
    public static void main(String[] args) {
        Teacher fatih = new Teacher("Fatih",8,"Matematik");
        Course mat = new Course("Matematik",101,"Mat101");
        Ogrenci ati = new Ogrenci("Atilla",572,"11-A",mat);
        mat.addTeacher(fatih);
        ati.notGir(80,60);
        ati.ortalama(40);
        ati.info();
    }
}
