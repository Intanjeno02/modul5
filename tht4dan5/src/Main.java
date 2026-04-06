public class Main {
    public static void main(String[] args){
    KamarHotel kamar1 = new KamarHotel("3016", "Standard", 30);
        kamar1.settipeKamar("Penthouse");
        kamar1.sethargaPerMalam(-40000000);

    KamarHotel kamar2 = new KamarHotel("2918", "Suite", 8, 10000000);

        kamar2.pesanKamar(4); 
        kamar2.pesanKamar(2); 
        kamar2.pesanKamar();  

    System.out.println("Tagihan Kamar 1 :");
        double total1 = kamar1.hitungTotalBayar(2, "PROMO");
        System.out.println("Total bayar: " + total1);

        System.out.println("Tagihan Kamar 2 :");
        double total2 = kamar2.hitungTotalBayar(4, "PROMO");
        System.out.println("Total bayar: " + total2);

    System.out.println("\n---STRUK INFORMASI---");

        System.out.println("\nKamar 1:");
        System.out.println("Nomor Kamar   : " + kamar1.getnomorKamar());
        System.out.println("Tipe Kamar    : " + kamar1.gettipeKamar());
        System.out.println("Kapasitas     : " + kamar1.getkapasitasMaks());
        System.out.println("Harga/Malam   : " + kamar1.gethargaPerMalam());
        System.out.println("Status        : " + (kamar1.isTersedia() ? "Tersedia" : "Terisi"));

        System.out.println("\nKamar 2:");
        System.out.println("Nomor Kamar   : " + kamar2.getnomorKamar());
        System.out.println("Tipe Kamar    : " + kamar2.gettipeKamar());
        System.out.println("Kapasitas     : " + kamar2.getkapasitasMaks());
        System.out.println("Harga/Malam   : " + kamar2.gethargaPerMalam());
        System.out.println("Status        : " + (kamar2.isTersedia() ? "Tersedia" : "Terisi"));
    }
}
