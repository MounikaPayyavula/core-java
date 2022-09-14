package newfeatures;

public class Order {
	public enum Side{BUY,SELL};   //constant array
	private int quantity;
	private double price;
	private String symbol;
	private Side side;
	
	
	public Order(int quantity, double price, String symbol, Side side) {
		this.quantity = quantity;
		this.price = price;
		this.symbol = symbol;
		this.side = side;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getSymbol() {
		return symbol;
	}


	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}


	public Side getSide() {
		return side;
	}


	public void setSide(Side side) {
		this.side = side;
	}


	@Override
	public String toString() {
		return "Order [quantity=" + quantity + ", price=" + price + ", symbol=" + symbol + ", side=" + side + "]";
	}
	
	//sorting algorithm a>b-->returns positive value
	//if a>b == >0 ,if a<b == <0,if a=b --> 0
	public static int compareBYQuantity(Order a,Order b)
	{
	return a.quantity-b.quantity;   //1000-500=500  /500-1000=-500
	}
	public static int compareByPrice(Order a,Order b)
	{
		return Double.valueOf(a.getPrice()).compareTo(b.getPrice());
	}
}
	
