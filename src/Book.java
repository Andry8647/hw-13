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


}
