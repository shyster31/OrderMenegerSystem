public class Book extends Item {

    private String isbn;
    private String title;



    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }


    public Book(int code, double price, String isbn, String name){
        this.code = code;
        this.price = price;
        this.isbn = isbn;
        this.title = name;
    }

    public Book() {
    }
}
