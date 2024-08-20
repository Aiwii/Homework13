public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Стивенсон", "Роберт Льюис");

        Book book1 = new Book("The Suicide Club", 1878, author1);

        Author author2 = new Author("Толстой", "Лев");

        Book book2 = new Book("Война и мир", 1863, author2);

        System.out.println(book1);

        System.out.println(book2);

        System.out.println(book1.hashCode());

        System.out.println(book2.hashCode());

        System.out.println(book1.equals(book2));

        Author author3 = new Author("Стивенсон", "Роберт Льюис");

        Book book3 = new Book("The Suicide Club", 1878, author3);

        System.out.println(book1.equals(book3));

    }
}