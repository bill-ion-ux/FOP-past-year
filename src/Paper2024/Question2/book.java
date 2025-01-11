package Paper2024.Question2;

public class book {
    private String title;
    private String author;
    private int yearPublished;

    public book(String title, String author, int yearPublished){
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }
    public String gettitle(){
        return title;
    }
    public String getauthor(){
        return author;
    }
    public int getyearPublished(){
        return yearPublished;
    }

    public static void main(String[] args) {
        book book1 = new book("Harry Potter", "J.K. Rowling", 1998);
        book book2 = new book("the Hobbit", "J.R.R Tolkien", 1937);
        book book3 = new book("The Da Vinci Code", "Dan Brown", 2003);

        System.out.println("book1`s details: " + book1.gettitle() + " by " + book1.getauthor() + " published in " + book1.getyearPublished());
        System.out.println("book2`s details: " + book2.gettitle() + " by " + book2.getauthor() + " published in " + book2.getyearPublished());
        System.out.println("book3`s details: " + book3.gettitle() + " by " + book3.getauthor() + " published in " + book3.getyearPublished());
    }
}
