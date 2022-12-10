public class Mainapp {
    public static void main(String[] args){
        Sampan spn = new Sampan(null, 0, 0);
        spn.jumlahKursi = 7;
        spn.biaya = 7000;
        spn.layar =3;

        Kapal kpl = new Kapal (null, 0, 0);
        kpl.jumlahKursi = 7;
        kpl.biaya = 7000;
        kpl.mesin = "Gawk";
        kpl.kecepatan = 20;

        spn.informasi()

    }
    
}
