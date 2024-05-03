/**
 * Book
 */
public class Book {

    private String name;
    private int pages;
    private int publicationYear;
    public Book(String name, int pages, int publicationYear){
        this.name = name;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }




	public String getName() {
		return name;
	}


	public int getPages() {
		return pages;
	}


	public int getPublicationYear() {
		return publicationYear;
	}
    public String toString(){
        return name + ", " + pages + " pages, " + publicationYear;
    }
}
