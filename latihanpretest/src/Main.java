public class Main{
    public static void main(String[] args) throws Exception {
       Mahasiswa mhs = new Mahasiswa();

       mhs.nama = "lerin";
       //mhs.nim = "10522";

       System.out.println(mhs.nama);
       mhs.setNim ("105224009");
       System.out.println(mhs.getNim());
       System.out.println(mhs.namaOr);
    }
}
