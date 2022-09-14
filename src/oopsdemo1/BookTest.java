package oopsdemo1;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1=new Book(); 
		b1.setBookId(101); 
		b1.setBookName("c");
		b1.setBookPrice(500);
		b1.setPublisher("APJ Publisher");
		

		//invoke getter methods --output
		System.out.println("*** Book Details ****"); 
		b1.display(); 
		System.out.println(b1.getBookId()+ " "+b1.getBookName()+" "+b1.getBookPrice()+" "+ b1.getPublisher());
		System.out.println("Discounted Price of Book :"+b1.discountPrice()); 
		System.out.println(b1);// invokes toString() method of the instance class
			Book b2=new Book();
			b2.setBookId(102);
			b2.setBookName("Python"); 
			b2.setBookPrice(600);
			b2.setPublisher("BPB Publisher");
			System.out.println("*** Book Details ****"); 
			System.out.println(b2.getBookId()+ " "+b2.getBookName()+" "+b2.getBookPrice()+" "+b2.getPublisher());
			System.out.println("Discounted Price of Book :"+b2.discountPrice());
			System.out.println(b2);

	}

}
