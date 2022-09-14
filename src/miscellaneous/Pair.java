package miscellaneous;

//Generic class with 2 parameters - Maps  -stores data in form of key & value pairs -Hashmap,

public class Pair<T,U> {
	private T first;
	private U second;


	public Pair() {
		
		this.first = first;
		this.second = second;
		
	}
	


	public Pair(T first, U second) {
		this.first = first;
		this.second = second;
	}
	



	public T getFirst() {
		return first;
	}



	public void setFirst(T first) {
		this.first = first;
	}



	public void setSecond(U second) {
		this.second = second;
	}
	
	public U getSecond() {
		return second;
	}



	


	

}
