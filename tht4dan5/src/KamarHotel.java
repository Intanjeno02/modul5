public class KamarHotel {
    private String nomorKamar;
    private String tipeKamar;
    private int kapasitasMaks;
    private double hargaPerMalam;
    private boolean isTersedia;

     public KamarHotel (String nomorKamar, String tipeKamar, int kapasitasMaks){
        this.nomorKamar = nomorKamar;
        this.tipeKamar = tipeKamar;
        this.kapasitasMaks = kapasitasMaks;
        this.hargaPerMalam = 0;
        this.isTersedia = true;
     }

     public KamarHotel (String nomorKamar, String tipeKamar, int kapasitasMaks, double hargaPerMalam){
        this.nomorKamar = nomorKamar;
        this.tipeKamar = tipeKamar;
        this.kapasitasMaks = kapasitasMaks;
        this.hargaPerMalam = hargaPerMalam;
        this.isTersedia = true;
     }

     public String getnomorKamar(){
      return nomorKamar;
     }

     public void setnomorKamar(String nomorKamar){
      this.nomorKamar = nomorKamar;
     }

     public String gettipeKamar(){
      return tipeKamar;
     }

      public int getkapasitasMaks(){
        return kapasitasMaks;
      }


      public void settipeKamar(String tipeKamar){
      if (tipeKamar.equalsIgnoreCase("Reguler") || tipeKamar.equalsIgnoreCase("Premium") || tipeKamar.equalsIgnoreCase("Suite")) {
         this.tipeKamar = tipeKamar;
         } else {
           System.out.println("Tipe kamar tidak valid! kami ubah ke Reguler.");
           this.tipeKamar = "Reguler";
           }
      }

      public double gethargaPerMalam() {
        return hargaPerMalam;
      }

      public void sethargaPerMalam(double hargaPerMalam) {
        if (hargaPerMalam < 50000) {
            System.out.println("Harga terlalu murah! Diubah ke 50000.");
            this.hargaPerMalam = 50000;
           } else {
             this.hargaPerMalam = hargaPerMalam;
             }
      }

      public boolean isTersedia() {
        return isTersedia;
      }

      public void pesanKamar() {
        if (isTersedia) {
            isTersedia = false;
           } else {
            System.out.println("Kamar sudah terisi!");
            }
      }

      public void pesanKamar(int jumlahTamu) {
        if (!isTersedia) {
            System.out.println("Kamar sudah terisi!");
         } else if (jumlahTamu > kapasitasMaks) {
            System.out.println("Jumlah tamu melebihi kapasitas!");
            } else {
              isTersedia = false;
              }
      }

   public void batalPesan() {
        isTersedia = true;
   }

   public double hitungTotalBayar(int jumlahMalam) {
    return jumlahMalam * hargaPerMalam;
   }

   public double hitungTotalBayar(int jumlahMalam, String kodeVoucher) {
    double total = jumlahMalam * hargaPerMalam;

   if (kodeVoucher.equalsIgnoreCase("PROMO") && jumlahMalam >= 3) {
        System.out.println("Voucher berhasil digunakan! Diskon 20%");
        return total * 0.8;
      } else {
        System.out.println("Voucher gagal digunakan!");
        return total;
        }
   }
}
