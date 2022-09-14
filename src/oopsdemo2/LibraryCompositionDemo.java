package oopsdemo2;

import java.util.ArrayList;
//Composition example

//weak-----classes are functionally independent

//classes are dependent
import java.util.List;

public class LibraryCompositionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Book b1=new Book("EffectiveJ java              ", "Joshua Bloch");
Book b2=new Book("Thinking in java             ", "Bruce Eckel");
Book b3=new Book("Java: The Complete Reference ","Herbert Schildt");

//creating the list which contains
//no.of books
List<Book> books=new ArrayList<Book>();
books.add(b1);
books.add(b2);
books.add(b3);

//Library object with books List initialized

Library lib=new Library(books);

//get Book List
List<Book> bks=lib.getBooks();
for(Book bk:bks)
{
	System.out.println("Title : "+bk.title+" and "+"Author : "+bk.author);
}



	}

}
