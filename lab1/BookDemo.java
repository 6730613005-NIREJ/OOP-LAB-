package lab1;

public class BookDemo {
    public static void main(String[] args) {

        Book book1 = new Book("Developing Java Software", "Russel Winder", 79.75);

        System.out.println("This is book title : " + book1.getTitle());
        System.out.println("This is book author : " + book1.getAuthor());

    }

}
