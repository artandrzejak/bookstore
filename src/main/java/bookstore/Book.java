package bookstore;

public class Book {
    private int id;
    private String title;
    private int isbnNumber;
    private int year;
    private String bezel;
    private Author author;
    private Category category;

    public Book(int id, String title, int isbnNumber, int year, String bezel, Author author, Category category) {
        this.id = id;
        this.title = title;
        this.isbnNumber = isbnNumber;
        this.year = year;
        this.bezel = bezel;
        this.author = author;
        this.category = category;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(int isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBezel() {
        return bezel;
    }

    public void setBezel(String bezel) {
        this.bezel = bezel;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}