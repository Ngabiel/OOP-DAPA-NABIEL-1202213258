public class Perangkat {

    String drive;
    int ram;
    double processor;
    
    public Perangkat(String drive, int ram, double processor){
        this.drive = drive;
        this.ram = ram;
        this.processor = processor;
    }
    public Perangkat(String drive2, int ram2, double processor2, boolean webcam) {
    }

    public void information(){
        System.out.println("Device doesnt have the "+drive+" type, with "+ram+" GB sized ram and "+processor+" Ghz processor");
    }
}
