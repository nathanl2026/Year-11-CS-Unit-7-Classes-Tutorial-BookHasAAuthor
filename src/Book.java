public class Book {
    private String title;
    private Author author;
    private double price;
    private int qty;

    public Book(String title, Author author, double price, int qty) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    public String getName() {
        return title;
    }
    public Author getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    @Override
    public String toString() {
        return "'" + title + "' by " + author.getName() + " (" + author.getGender() + ") at " + author.getEmail();
    }

}