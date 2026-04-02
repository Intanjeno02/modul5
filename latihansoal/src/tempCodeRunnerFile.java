public class Main {
    public static void main(String[] args) throws Exception {
        Karyawan identitas1 = new Karyawan("Shinta", "105224", "Ilmu komputer");

        System.out.println("Nama karyawan : " + identitas1.getNama());
        System.out.println("Id karyawan : " + identitas1.getidKaryawan());
        identitas1.setgajiPokok(40000000);
        System.out.println("gaji pokok karyawan adalah : " + identitas1.getgajiPokok());
        System.out.println("departemen :" + identitas1.getdepartemen());

    }
}