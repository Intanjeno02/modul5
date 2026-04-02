public class Barang{
    private String idBarang;
    private String namaBarang;
    private int stok;
    private double hargaSatuan;
    protected String kategori;

    public Barang(String idBarang, String namaBarang) {
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.stok = 0;
        this.hargaSatuan = 0;
    }

    public String getidBarang(){ 
        return idBarang; 
    }

    public void setidBarang(String idBarang){
        this.idBarang = idBarang;
    }

    public String getnamaBarang(){ 
        return namaBarang; 
    }

    public void setnamaBarang(String namaBarang){ 
        this.namaBarang = namaBarang; 
    }

    public int getstok(){
        return stok; 
    }

    public void setstok(int stok){
        if (stok >= 0) {
            this.stok = stok;
        } else {
            System.out.println("pastikan stok tidak negatif.");
        }
    }

    public double gethargaSatuan(){ 
        return hargaSatuan; 
    }

    public void sethargaSatuan(double hargaSatuan) {
        if (hargaSatuan > 0) {
            this.hargaSatuan = hargaSatuan;
        } else {
            System.out.println("Harga tidak boleh kurang dari atau sama dengan 0.");
        }
    }

    public void tambahstok(int jumlah) {
        if (jumlah > 0) {
            stok += jumlah;
        } else {
            System.out.println("Jumlah stok harus lebih dari 0.");
        }
    }

    public void kurangistok(int jumlah) {
        if (jumlah > 0 && jumlah <= stok) {
            stok -= jumlah;
        } else {
            System.out.println("Pengurangan tidak valid!");
        }
    }
}