public class MainApp {
    public static void main(String[] args){
        Perangkat pkt = new Perangkat(null, 0, 0);
        pkt.drive = "bdata";
        pkt.ram = 16;
        pkt.processor = 4.0;
        Handphone hp = new Handphone(null, 0, 0, true);
        hp.drive = "brokestone";
        hp.ram = 8;
        hp.processor = 3.0;
        hp.fingerprint = false;
        Laptop lp = new Laptop(null, 0, 0, true);
        lp.drive = "Samseng";
        lp.ram = 32;
        lp.processor = 5.0;
        lp.webcam = true;

        pkt.information();

        System.out.println();

        lp.information();
        lp.Game("Nier Automata");
        lp.Email("tronNox22@gmail.com");
        lp.Email("nabielis@student.telkomuniversity.ac.id","broketree69@gmail.com");

        System.out.println();

        hp.information();
        hp.phone(629876543);
        hp.SMS(629876543);
        hp.SMS(629876543, 621234567);
    }
}
