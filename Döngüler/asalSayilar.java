public class asalSayilar {
    public static void main(String[] args) {
        int sayac;
        for (int i = 2; i <= 1000; i++) {
            sayac = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    sayac++;
                }
            }
            if (sayac == 2) {
                System.out.println(i);
            }
        }
    }
}