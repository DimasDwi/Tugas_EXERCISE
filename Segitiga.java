/**
 * Created by user on 5/19/2015.
 */
public class Segitiga {
    int tinggi;
    int alas;
    int sisiyangmiring;

    public void CetakkanDiLayar()
    {
        System.out.println("Tinggi : " + tinggi);
        System.out.println("Alas : " + alas);
        System.out.println("SisiYangMiring : " + sisiyangmiring);
    }

    public void ubahProperty(int tinggiAnyar,int alasAnyar,int sisiyangmiringAnyar)
    {
        tinggi = tinggiAnyar;
        alas = alasAnyar;
        sisiyangmiring = sisiyangmiringAnyar;
    }

    public int hitungKelilingSegitiga()
    {
        int keliling;
        keliling = (alas + (2 * sisiyangmiring));
        return keliling;
    }

    public double hitungLuasSegitiga()
    {
        double luas;
        luas = (alas * tinggi /2);
        return luas;
    }
}
