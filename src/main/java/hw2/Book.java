package hw2;

public class Book {
    String title;
    String author;

    public static void main(String[] args) {
        Book book = new Book("Гарри Поттер", "Пушкин");
        book.setAuthor("Роулинг");
        book.printInfo();
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void printInfo() {
        System.out.println(this.author + " " + this.title);
    }
}
