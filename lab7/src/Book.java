public class Book {
    protected String title;
    protected String author;
    protected String genre;
    protected int year;

    public Book(String title, String author, String genre, int year) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println(title + " by " + author + " (" + year + ")");
    }
}
