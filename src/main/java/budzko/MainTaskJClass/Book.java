package budzko.MainTaskJClass;

public class Book {
    private int id;
    private String nameOfBook;
    private String author;
    private String publishing;
    private int publicationDate;
    private int numberOfPages;
    private double price;
    private String typeOfBinding;

    public Book(int id, String nameOfBook, String author, String publishing, int publicationDate, int numberOfPages, double price, String typeOfBinding) {
        this.id = id;
        this.nameOfBook = nameOfBook;
        this.author = author;
        this.publishing = publishing;
        this.publicationDate = publicationDate;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.typeOfBinding = typeOfBinding;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public int getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(int publicationDate) {
        this.publicationDate = publicationDate;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTypeOfBinding() {
        return typeOfBinding;
    }

    public void setTypeOfBinding(String typeOfBinding) {
        this.typeOfBinding = typeOfBinding;
    }

    public void showAuthor() {
        if ("Роман Злотников ".equals(this.getAuthor())) {
            System.out.println("ID: " + getId());
            System.out.println("Name of book: " + getNameOfBook());
            System.out.println("Publishing: " + getPublishing());
            System.out.println("Publication Date: " + getPublicationDate());
            System.out.println("Number of pages: " + getNumberOfPages());
            System.out.println("Price: " + getPrice());
            System.out.println("Type of binding: " + getTypeOfBinding() + "\n");

        }
    }

    @Override
    public String toString() {
        String s = "ID: " + getId() + "\t" + "Name: " + getNameOfBook() + "\t" + "Author: " + getAuthor() + "\t" + "Publishing: " + getPublishing() + "\t"
                + "Publishing date: " + getPublicationDate() + "\t" + "Number of pages: " + getNumberOfPages() + "\t" + "price: " +
                getPrice() + "\t" + "type of binding: " + getTypeOfBinding();
        return s;
    }

    public void showYear() {
        if ((this.getPublicationDate()) > 2015) {
            System.out.println("ID: " + getId());
            System.out.println("Name of book: " + getNameOfBook());
            System.out.println("Author: " + getAuthor());
            System.out.println("Publishing: " + getPublishing());
            System.out.println("Publication Date: " + getPublicationDate());
            System.out.println("Number of pages: " + getNumberOfPages());
            System.out.println("Price: " + getPrice());
            System.out.println("Type of binding: " + getTypeOfBinding() + "\n");

        }
    }

    public void showPublishing() {
        if ("АСТ " == this.getPublishing()) {
            System.out.println("ID: " + getId());
            System.out.println("Name of book: " + getNameOfBook());
            System.out.println("Author: " + getAuthor());
            System.out.println("Publication Date: " + getPublicationDate());
            System.out.println("Number of pages: " + getNumberOfPages());
            System.out.println("Price: " + getPrice());
            System.out.println("Type of binding: " + getTypeOfBinding() + "\n");

        }
    }
}
