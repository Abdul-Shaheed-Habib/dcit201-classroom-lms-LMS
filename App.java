 class Library {
    private String name;
    private String address;

    public Library (String name, String address){
    this.name = name;
    this.address = address;
    }
    public String getName(){
    return name;
    }

    public void setName (String name){
    this.name= name;
    }

    public String getAddress(){
    return address;
    }
    public void setAddress (String address){
    this.address= address;
    }

    public void addBook(Book Book){

    }

    public void removeBook(Book Book){

    }
    
    public Book searchBook(String title){
        return null;
    }
 }
class Book{
    private String title;
    private String author;
    private String publicationDate;

    public Book(String title,  String author, String publicationDate){
        this.title=title;
        this.author=author;
        this.publicationDate=publicationDate;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }

    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author=author;
    }

    public String getPublicationDate(){
        return publicationDate;
    }
    public void setPublicationDate(String publicationDate){
        this.publicationDate=publicationDate;
    }
}

class Patron{
    @SuppressWarnings("unused")
    private String name;
    @SuppressWarnings("unused")
    private String address;
    @SuppressWarnings({"FieldMayBeFinal", "unused"})
    private Book[] borrowedBooks;

    public Patron(String name,String address){
        this.name=name;
        this.address=address;
        this.borrowedBooks=new Book[3];
    }

    public String getName(String name){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getAddress(String address){
        return address;
   }
   public void setAddress(String address){
        this.address=address;   
}
  public void borrowBook(Book Book){

   } 

   public void returnBook(Book Book){

   } 
   public Book searchBook(String title){
    return null;
   }
}

public class App {
    public static void main(String[] args) {
        Library library = new Library("Habib Library", "St. Anna Street 146");

        Book book1 = new Book("Mama Africa", "A. Meghan Alan", "1835");
        Book book2 = new Book("The rapture", "Bernard Hagan", "1980");

        library.addBook(book1);
        library.addBook(book2);

        Patron patron = new Patron("Shakur Habib", "Anna Park 234");

        patron.borrowBook(book1);

        Book searchedBook = library.searchBook("The rapture");
        System.out.println(searchedBook);

        patron.returnBook(book1);
}
}


