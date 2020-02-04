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

    public String getNameOfBook() {
        return nameOfBook;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishing() {
        return publishing;
    }

    public int getPublicationDate() {
        return publicationDate;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public double getPrice() {
        return price;
    }

    public String getTypeOfBinding() {
        return typeOfBinding;
    }

    @Override
    public String toString() {
        return "|ID: " + getId() + "|\t"
                + "|Name: " + getNameOfBook() + "|\t"
                + "|Author: " + getAuthor() + "|\t"
                + "|Publishing: " + getPublishing() + "|\t"
                + "|Publishing date: " + getPublicationDate() + "|\t"
                + "|Number of pages: " + getNumberOfPages() + "|\t"
                + "|price: " + getPrice() + "|\t"
                + "|type of binding: " + getTypeOfBinding();
    }

    public void showAuthor() {
        if ("Роман Злотников ".equals(this.getAuthor())) {
            String outputAuthor = "ID: " + getId() + "\n";
            outputAuthor += "Name of book: " + getNameOfBook() + "\n";
            outputAuthor += "Publishing: " + getPublishing() + "\n";
            outputAuthor += "Publication Date: " + getPublicationDate() + "\n";
            outputAuthor += "Number of pages: " + getNumberOfPages() + "\n";
            outputAuthor += "Price: " + getPrice() + "\n";
            outputAuthor +=  "Type of binding: " + getTypeOfBinding() + "\n";
            System.out.println(outputAuthor);
        }
    }



    public void showYear() {
        if ((this.getPublicationDate()) > 2015) {
            String outputYear = "ID: " + getId() + "\n";
            outputYear += "Name of book: " + getNameOfBook() + "\n";
            outputYear += "Author: " + getAuthor() + "\n";
            outputYear += "Publishing: " + getPublishing() + "\n";
            outputYear += "Publication Date: " + getPublicationDate() + "\n";
            outputYear += "Number of pages: " + getNumberOfPages() + "\n";
            outputYear += "Price: " + getPrice() + "\n";
            outputYear += "Type of binding: " + getTypeOfBinding() + "\n";
            System.out.println(outputYear);

        }
    }

    public void showPublishing() {
        if ("АСТ".equals(this.getPublishing())) {
            String outputPublishing = "ID: " + getId()+ "\n";
            outputPublishing += "Name of book: " + getNameOfBook()+ "\n";
            outputPublishing += "Author: " + getAuthor()+ "\n";
            outputPublishing += "Publication Date: " + getPublicationDate()+ "\n";
            outputPublishing += "Number of pages: " + getNumberOfPages()+ "\n";
            outputPublishing += "Price: " + getPrice()+ "\n";
            outputPublishing += "Type of binding: " + getTypeOfBinding() + "\n";
            System.out.println(outputPublishing);
        }
    }
}
