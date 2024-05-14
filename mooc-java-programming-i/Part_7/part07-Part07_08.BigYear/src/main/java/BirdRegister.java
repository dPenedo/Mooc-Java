import java.util.ArrayList;

public class BirdRegister {
    private ArrayList<Bird> birdRegister;
    public BirdRegister(){
        this.birdRegister = new ArrayList<>();
    }
	public ArrayList<Bird> getBirdRegister() {
		return birdRegister;
	}
    public void addBird(String name, String latinName){
        Bird newBird = new Bird(name, latinName);
        birdRegister.add(newBird);
    }
    public void addObservation(String birdName){
        for (Bird bird : birdRegister) {
            if (bird.getName().equals(birdName)) {
                bird.addObservation();
            }
        }
    }




}
