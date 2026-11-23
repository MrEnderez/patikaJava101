public class Main {
    public static void main(String[] args) {
        Teacher kemal = new Teacher("Kemal",8,"Matematik");
        Course mat = new Course("Matematik",101,"Mat101");
        Ogrenci ayse = new Ogrenci("Ayse",572,"11-A",mat);
        mat.addTeacher(kemal);
        ayse.notGir(80,60);
        ayse.ortalama(40);
        ayse.info();
    }
}
