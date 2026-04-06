public class Main {
    public static void main(String[] args) throws Exception {
        Barang barang = new Barang("B001", "Laptop");
        barang.kategori = "Elektronik";

        barang.sethargaSatuan(-2500); 
        barang.kurangistok(3);       

        barang.sethargaSatuan(5400000);
        barang.tambahstok(15);
        barang.kurangistok(2);

        System.out.println("=== detail semua barang ===");
        System.out.println("ID barang: " + barang.getidBarang());
        System.out.println("Nama     : " + barang.getnamaBarang());
        System.out.println("Kategori : " + barang.kategori);
        System.out.println("Stok     : " + barang.getstok());
        System.out.println("Harga    : " + barang.gethargaSatuan());
        
    }
}
