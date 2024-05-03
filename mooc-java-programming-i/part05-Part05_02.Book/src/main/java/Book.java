/**
 * Book
 */
public class Book {

    private String author;
    private String name;
    private int pages;
    public Book(String author,String title,   int pages){
        this.author = author;
        this.name = title;
        this.pages = pages;
    }


	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public int getPages() {
		return pages;
	}
    public String toString(){
        return author + ", " + name + ", " + pages + " pages";
    }

}
