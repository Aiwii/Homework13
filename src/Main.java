public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Стивенсон", "Роберт Льюис");

        Book book1 = new Book("The Suicide Club", 1878, author1);

        Author author2 = new Author("Толстой", "Лев");

        Book book2 = new Book("Война и мир", 1863, author2);

        System.out.println("Год публикации: " + book1.getPublicationYear());

        book1.setPublicationYear(1879);

        System.out.println("Год публикации: " + book1.getPublicationYear());
    }
}