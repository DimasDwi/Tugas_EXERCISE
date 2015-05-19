/**
 * Created by user on 5/19/2015.
 */
public class Mahasiswa {
   
    private String namaMahasiswa;
    private int umurmahasiswa;

    public Mahasiswa (String nama,int umur){
        namaMahasiswa = nama;
        umurmahasiswa = umur;
    }

    public void setNamaMahasiswa(String nama){
       namaMahasiswa = nama;
    }

    public String getNamaMahasiswa(){
        return namaMahasiswa;
    }

    public void setumurMahasiswa (int umur){
        umurmahasiswa = umur;
    }

    public int getUmurMahasiswa(){
        return umurmahasiswa;
    }

    public void tampilkanbiodata(){
        System.out.println(":::::BIODATA:::::");
        System.out.println("Nama : " + namaMahasiswa);
        System.out.println("Umur : " + umurmahasiswa);
    }

}
