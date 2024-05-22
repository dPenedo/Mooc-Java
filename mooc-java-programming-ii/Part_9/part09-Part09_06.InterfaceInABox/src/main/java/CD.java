/**
 * CD
 */
public class CD implements Packable {
    private String artist;
    private String nameOfTheCD;
    private int publicationYear;
    private double weight;
    public CD(String artist, String nameOftheCD, int publicationYear){
        this.artist = artist;
        this.nameOfTheCD = nameOftheCD;
        this.publicationYear = publicationYear;
        this.weight = 0.1;
    }

    @Override
    public double weight(){
        return this.weight;
    }

    @Override
    public String toString(){
        return this.artist + ": " + this.nameOfTheCD + " (" + this.publicationYear + ")";

    }



}
