/**
 * Created by user on 5/19/2015.
 */
public class TestLingkaran {
    public static void main(String[] args) {
        Lingkaran bola = new Lingkaran();

        bola.jari= 20;
        bola.diameter= 40;

        bola.CetakkanDiLayar();
        System.out.println("-----------------------------------");

        System.out.println("Luas : " + bola.hitungLuas());
        System.out.println("Keliling : " + bola.hitungKeliling());
        System.out.println("-----------------------------------");

    }
}
