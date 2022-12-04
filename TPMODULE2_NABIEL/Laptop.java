public class Laptop extends Perangkat {

    protected boolean webcam;
    public Laptop(String drive, int ram, double processor, boolean webcam){
        super(drive, ram, processor, webcam);
    }

    public void information(){
        if(webcam){
            System.out.println("This Laptop doesnt have a "+drive+" type ram with "+ram+" GB RAM and "+processor+" Ghz processor but it have a webcam");
        } else {
            System.out.println("This Laptop have a "+drive+" type ram with "+ram+" GB RAM and "+processor+" Ghz processor but it doesent have a webcam");
        }
    }
    public void Game(String nama_game){
        System.out.println("Laptop opening "+nama_game);
    }
    public void Email(String email){
        System.out.println("Laptop send the Email sucessfully to "+email);
    }
    public void Email(String email1, String email2){
        System.out.println("Laptop send the Email sucessfully to "+email1+" and "+email2);
    }
}
