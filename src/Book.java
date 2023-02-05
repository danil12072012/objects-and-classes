public class Book {
    private String nameBook;
    private int year;
    private Author author;

    public Book(String nameBook, int year, Author author) {
        this.nameBook = nameBook;
        this.year = year;
        this.author = author;
    }

    public String getNameBook() {
        return nameBook;
    }

    public int getYear() {
        return year;
    }

    public Author getAuthor() {
        return author;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void fullNameBook() {
        System.out.println("Название книги: " + getNameBook() + " , год издания: " + getYear() + " , автор: " + getAuthor().getNameAuthor() + " " + getAuthor().getSurnameAuthor());
    }
}
