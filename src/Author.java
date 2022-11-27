import java.util.Objects;

public class Author {
   private String nameAuthor;
    public Author(String nameAuthor){
        this.nameAuthor = nameAuthor;
    }
    public String getNameAuthor(){
        return this.nameAuthor;
    }
    public String toString() {
        return nameAuthor;
    }
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author nameAuthor2 = (Author) other;
        return nameAuthor.equals(nameAuthor2.nameAuthor);
    }
    public int hashCode(){
        return Objects.hash(nameAuthor);

    }
}
