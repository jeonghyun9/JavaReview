package workShop04;

public class Quiz02 {
    public static void main(String[] args) {

        Book book1 = new Book("SQL Plus", 50000, 5.0);
        Book book2 = new Book("Java 2.0", 40000, 3.0);
        Book book3 = new Book("JSP Servlet", 60000, 6.0);

        System.out.println("책이름\t   가격\t   할인율\t할인후금액");
        System.out.println("--------------------------------------");
        System.out.printf("%s\t%d\t%.1f%%\t%.1f원\n",book1.bookName,book1.bookPrice,book1.bookDiscountRate,book1.getBookDiscountRate());
        System.out.printf("%s\t%d\t%.1f%%\t%.1f원\n",book2.bookName,book2.bookPrice,book2.bookDiscountRate,book2.getBookDiscountRate());
        System.out.printf("%s\t%d\t%.1f%%\t%.1f원",book3.bookName,book3.bookPrice,book3.bookDiscountRate,book3.getBookDiscountRate());
    }
}

class Book {
    String bookName;
    int bookPrice;
    double bookDiscountRate;

    public Book() {

    }

    public Book(String bookName, int bookPrice, double bookDiscountRate) {
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.bookDiscountRate = bookDiscountRate;
    }

    public double getBookDiscountRate() {
        double rate = bookPrice * ((100 -bookDiscountRate)/100);
        return rate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    public void setBookDiscountRate(double bookDiscountRate) {
        this.bookDiscountRate = bookDiscountRate;
    }
}

