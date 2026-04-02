public class RekeningBank {
    private String nomorRek;
    private int saldo;

    RekeningBank(String nomorRek, int saldo){
        this.nomorRek = nomorRek;
        setSaldo(saldo);
    }

    public int getSaldo(){
        return this.saldo;
    }

    public void setSaldo(int saldobaru){
        if (saldobaru < 0) {
            System.out.println("salah");
        } else {
            this.saldo = saldobaru;
            System.out.println("berhasil di update.");
        }
    }
}