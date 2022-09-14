package oopsdemo2;

import java.util.List;

public class Library {
	
	
	List<Book> books;//object Reference ---composition

	//constructor to initialize books in library
	public Library(List<Book> books) {
		this.books = books;
	}

	//getter() method to getBooks in Library
	public List<Book> getBooks() {
		return books;
	}

	
	
	

}
