public class TransportasiAir {
    protected int jumlahKursi,  biaya;

    // Create 1 operator for perangkat class with parameters of drive, ram, and processor
    public TransportasiAir(int jumlahKursi, int biaya){
        this.jumlahKursi = jumlahKursi;
        this.biaya = biaya;
    }
    // Create 3 public method named informasi
    public void informasi(){
        System.out.println("Transportasi Air jenis tidak diketahui dengan kursi berjumlah "+jumlahKursi+" ditetapkan dengan biaya sebesar Rp."+biaya);
    }
    public void berlayar(){
        System.out.println("Transportasi Air jenis tidak diketahui sedang berlayar menggunakan");
    }
    public void berlabuh(){
        System.out.println("Transportasi Air jenis tidak diketahui berlabuh di pantai");
    }
}