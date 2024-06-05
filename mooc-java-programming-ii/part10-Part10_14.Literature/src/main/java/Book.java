/**
 * Book
 */
public class Book {

    private String title;
    private int recommendedAge;

    public Book(String title, int recommendedAge){
        this.title = title;
        this.recommendedAge = recommendedAge;
    }

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getRecomendedAge() {
		return recommendedAge;
	}

	public void setRecomendedAge(int recommendedAge) {
		this.recommendedAge = recommendedAge;
	}

    @Override
    public String toString(){
        return this.title + " (recommended for " + this.recommendedAge + " year-olds or older)";
    }

}
