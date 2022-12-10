public class Kapal extends TransportasiAir {
    protected String mesin;

    public Kapal(int jumlahKursi, int biaya, String mesin){
        super(jumlahKursi, biaya, mesin);
        this.mesin;
    }
    @Override
    public void informasi(){
        System.out.println("Transportasi Air jenis kapal dengan kursi berjumlah "+jumlahKursi+" ditetapkan dengan biaya sebesar Rp."+biaya);
    }
    public void berlayar(){
        System.out.println("Transportasi Air jenis kapal sedang berlayar menggunakan "+mesin+" layar");
    }
    public void berlayar(int kecepatan){
        System.out.println("Transportasi Air jenis kapal berlabuh di pantai");
    }
    public void berlabuh(){
        System.out.println("Transportasi Air jenis kapal berlabuh di air menggunakan "+jang+ "Jangkar");
    }
}
