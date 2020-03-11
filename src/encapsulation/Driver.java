package encapsulation;

public class Driver {
    public static void main(String[] args) {

        Book book1 = new Book("Talking to Strangers", "Malcolm Gladwell");

        System.out.println(book1.getTitle());
        System.out.println(book1.getAuthor());
        System.out.println(book1.isBorrowed());

        // setting book1 borrowed field (instange var)
        book1.setBorrowed(true);
        System.out.println(book1.isBorrowed());

        Person mei = new Person("Poke123");
        Person jiro = new Person("Jiro");

        System.out.println();
    }
}
