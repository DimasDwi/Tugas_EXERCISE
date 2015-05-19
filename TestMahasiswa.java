/**
 * Created by user on 5/19/2015.
 */
public class TestMahasiswa {
    public static void main(String[] args) {

        {

            Mahasiswa mhs = new Mahasiswa("Ridwan Rismanto", 20);
            mhs.tampilkanbiodata();

            System.out.println();

            mhs.setumurMahasiswa(25);
            mhs.tampilkanbiodata();
        }
    }
}