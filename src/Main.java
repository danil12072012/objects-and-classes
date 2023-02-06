public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("Шарль", "Пьеро");
        Book book1 = new Book("Красная шапочка",1697, author1);
        Author author2 = new Author("Михаил", "Шолохов");
        Book book2 = new Book("Тихий дон", 1984, author2);

        book1.fullNameBook();
        book2.fullNameBook();
        book1.setYear(1721);
        book1.fullNameBook();
        System.out.println(author1);
        System.out.println(book1);
        System.out.println(author1.equals(author2));
        System.out.println(book1.equals(book2));
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(author1.hashCode());
        System.out.println(author2.hashCode());





    }
}