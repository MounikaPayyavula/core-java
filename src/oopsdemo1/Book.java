package oopsdemo1;
/* * The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users.
 *  * To achieve this, you must: declare class variables/attributes as private 
 *  provide public get and set methods to access and update the value of a private variable 
 *  The get method returns the value of the variable name. 
 *  The set method takes a parameter (newName) and assigns it to the name variable. */

public class Book {
//properties
	private int bookId;
	private String bookName;
	private float bookPrice;
	private String publisher;
	// Generate Getters & Setters -> Place a cursor in new blank line --> Right Click
	// --> Source ---> Generate Getters & Setters --> Select All --> Generate
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public float getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(float bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	void display()
	{
		System.out.println("***** Welcome to Regal Book Store *****");
		}
	float discountPrice()
	{
		return ((this.bookPrice)-(this.bookPrice*.10f)); 
		}
	
	
	
	// Generate toString() Method -- Converts Object in to String
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookPrice=" + bookPrice + ", publisher="
				+ publisher + "]";
	}
	
	
	
	}
