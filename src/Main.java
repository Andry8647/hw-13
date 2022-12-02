public class Main {

    public static void main(String[] args) {
        System.out.println("Задание 1");
        Author nameAuthor = new Author("Фрэнсис Скотт Фицджеральд");
        Book book = new Book("Великий Гэтсби",nameAuthor,1925);
        System.out.println("book.nameBook = " + book.getNameBook());
        System.out.println("nameAuthor = " + nameAuthor.getNameAuthor());
        System.out.println("book.year = " + book.getYear());
        book.setYear(1926);
        System.out.println("book.year = " + book.getYear());
        Author nameAuthor2 = new Author("Лев Толстой");
        Book book2 = new Book("Война и мир",nameAuthor2,1873);
        System.out.println("book.nameBook = " + book2.getNameBook());
        System.out.println("nameAuthor = " + nameAuthor2.getNameAuthor());
        System.out.println("book.year = " + book2.getYear());
        book2.setYear(1869);
        System.out.println("book.year = " + book2.getYear());

        System.out.println(new Book("Великий Гэтсби",nameAuthor,1925));
        System.out.println(new Book("Война и мир",nameAuthor2,1873));
        System.out.println(book.equals(book2));
        System.out.println(nameAuthor.equals(nameAuthor2));
        System.out.println(book.hashCode() + " " + book2.hashCode());
        System.out.println(nameAuthor.hashCode() + " " + nameAuthor2.hashCode());

    }

}