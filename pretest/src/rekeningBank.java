public class rekeningBank{
    private int nomorRek;
    private double saldo;

    public rekeningBank (int nomorRek, double saldo){
        this.nomorRek = nomorRek;
        this.saldo = saldo;

        if (saldo==0){
            System.out.println("saldo anda" + this.saldo)
        } else {
            System.out.println("maaf saldo anda tidak mencukupi")
        }

    public isisaldo(){
        System.out.println("masukkan jumlah saldo yang ingin anda masukkan : ");
        this.saldo = saldo + this.saldo;
        System.out.println("saldo anda sekarang adalah : " + this.saldo);
    } 

    }
}