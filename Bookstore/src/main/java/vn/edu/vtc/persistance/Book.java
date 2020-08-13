package vn.edu.vtc.persistance;

public class Book {
  private int bookId;
  private int publishingCompanyName;
  private String title;
  private String author;
  private double price;
  private String detail;
  private int quantity;
  private String isbn;

  public Book(){
    this.bookId = bookId;
    this.publishingCompanyName = publishingCompanyName;
    this.title = title;
    this.author = author;
    this.price = price;
    this.detail = detail;
    this.quantity = quantity;
    this.isbn = isbn;
  }

  public int getBookId(){
    return bookId;
  }

  public int getPublishingCompanyName(){
    return publishingCompanyName;
  }

  public void setBookId(int bookId){
    this.bookId = bookId;
  }

  public void setPublishingCompanyName(int publishingCompanyName){
    this.publishingCompanyName = publishingCompanyName;
  }
  
  public void setTitle(String title){
    this.title = title;
  }

  public void setAuthor(String author){
    this.author= author;
  }

  public void setPrice(double price){
    this.price = price;
  }

  public void setDetail(String detail){
    this.detail = detail;
  }

  public void setQuantity(int quantity){
    this.quantity = quantity;
  }

  public void setIsbn(String isbn){
    this.isbn = isbn;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public double getPrice() {
    return price;
  }

  public String getDetail() {
    return detail;
  }

  public int getQuantity() {
    return quantity;
  }

  public String getIsbn() {
    return isbn;
  }
}