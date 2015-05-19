/**
 * Created by user on 5/19/2015.
 */
public class Lingkaran {
    int jari;
    int diameter;

    public void CetakkanDiLayar()
    {
        System.out.println("Jari-Jari: " + jari);
        System.out.println("Diameter: " + diameter);
    }

    public void ubahProperty(int jariAnyar, int diameterAnyar)
    {
        jari = jariAnyar;
        diameter = diameterAnyar;
    }

    public double hitungKeliling()
    {
        double keliling;
        keliling = 3.14 * diameter;
        return keliling;
    }

    public double hitungLuas()
    {
        double luas;
        luas = 3.14 * jari * jari;
        return luas;
    }
}





