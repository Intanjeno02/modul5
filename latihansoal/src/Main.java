public class Main {
    public static void main(String[] args) {

        Karyawan identitas1 = new Karyawan("Shinta", "105224");
        identitas1.setDepartemen("Ilmu Komputer");

        identitas1.setGajiPokok(400000);

        System.out.println("Nama karyawan : " + identitas1.getNama());
        System.out.println("Id karyawan : " + identitas1.getIdKaryawan());
        System.out.println("Gaji pokok : " + identitas1.getGajiPokok());
        System.out.println("Departemen : " + identitas1.getDepartemen());
    }
}