import java.util.Objects;
public class Book {
   private String nameBook;
   private Author nameAuthor;
    private int year;
    public Book(String nameBook,Author nameAuthor, int year){

        this.nameBook = nameBook;
        this.nameAuthor = nameAuthor;
        this.year = year;

    }
    public String getNameBook(){
        return this.nameBook;
    }
    public Author getNameAuthor(){
        return this.nameAuthor;
    }
    public int getYear(){
        return this.year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public String toString() {
        return nameBook + " " + nameAuthor + " " + year;
    }
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book book2 = (Book) other;
        return nameBook.equals(book2.nameBook);
        }
    public int hashCode(){
        return Objects.hash(nameBook);

    }




}
