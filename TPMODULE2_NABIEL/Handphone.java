public class Handphone extends Perangkat{

    protected boolean fingerprint;
    public Handphone(String drive, int ram, double processor, boolean fingerprint){
        super(drive, ram, processor);
    }
    public void information(){
        if(fingerprint){
            System.out.println("This handphone have a "+drive+" with "+ram+" GB RAM and "+processor+" Ghz Processor and a fingerprint");
        } else {
            System.out.println("This handphone have a "+drive+" with "+ram+" GB RAM and "+processor+" Ghz Processor but doesnt have a fingerprint");
        }
    }
    public void phone(int no_hp){
        System.out.println("Handphone successfully dialed to "+no_hp);
    }
    public void SMS(int no_hp){
        System.out.println("Handphone successfully sent SMS to "+no_hp);
    }
    public void SMS(int no_hp1, int no_hp2){
        System.out.println("Handphone successfully sent SMS to "+no_hp1+" and No "+no_hp2);
    }
}