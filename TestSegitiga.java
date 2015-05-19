/**
 * Created by user on 5/19/2015.
 */
public class TestSegitiga {
    public static void main(String[] args) {
        Segitiga bola = new Segitiga();

        bola.tinggi = 15;
        bola.alas = 15;
        bola.sisiyangmiring = 30;

        bola.CetakkanDiLayar();
        System.out.println("-----------------------------------");

        System.out.println("Luas : " + bola.hitungLuas());
        System.out.println("Keliling : " + bola.hitungKeliling());
        System.out.println("-----------------------------------");
    }
}
