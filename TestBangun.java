/**
 * Created by user on 5/19/2015.
 */
public class TestBangun {
    public static void main(String[] args) {
        Segitiga bangun_Segitiga = new Segitiga();
        Lingkaran bangun_Lingkaran = new Lingkaran();

        bangun_Segitiga.alas = 25;
        bangun_Segitiga.tinggi = 25;
        bangun_Segitiga.sisiyangmiring = 15;
        bangun_Lingkaran.jari= 10;
        bangun_Lingkaran.diameter= 15;

        System.out.println();
        System.out.println(":::::::::::: BANGUN LINGKARAN::::::::::::::");
        System.out.println();

        bangun_Lingkaran.CetakkanDiLayar();
        System.out.println("Luas Lingkaran: " + bangun_Lingkaran.hitungLuasLingkaran());
        System.out.println("Keliling Lingkarang: " + bangun_Lingkaran.hitungKelilingLingkarang());


        System.out.println();
        System.out.println(":::::::::::: BANGUN SEGITIGA:::::::::::::::");
        System.out.println();
        bangun_Segitiga.CetakkanDiLayar();
        System.out.println("Luas Segitiga: " + bangun_Segitiga.hitungLuasSegitiga());
        System.out.println("Keliling Segitiga: " + bangun_Segitiga.hitungKelilingSegitiga());
    }
}
