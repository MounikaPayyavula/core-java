package oopsdemo3;
//upcasting is used when u want to generalize a function or
//property so that it can be used by any of its subtype
class Game {
	public void play()
	{
		System.out.println("Game is being played");
	}
	public void noOfPlayers()
	{
		System.out.println("No .of players depend upon the game");
	}
	public void winner(String name)
	{
		System.out.println("winner is : "+name);
	}
	
}
class Cricket extends Game
{
	public void noOfPlayers()
	{
		System.out.println("No .of players : 22");
	}
	public void teams()
	{
		System.out.println("2");
	}
}
class Chess extends Game
{
	public void noOfPlayers()
	{
		System.out.println("No .of players : 2");
	}
}

public class UpCastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game g=new Cricket();            //upcasting call overriden& base class  methods 
		Game g1=new Chess();
		g.play();    //dynamic binding
		g.noOfPlayers();
		g.winner("A");
		
		//g.teams();     //compiler error
		
		
		
		Cricket c=new Cricket();
		c.teams();   //static binding
		
		g1.play();      //base class method
		g1.noOfPlayers();  //overridden method
		g1.winner("Vish");
		System.out.println("*******************************");
		
		
		Game g100;           //upcasting
		g100=new Cricket();
		
		g100.play();
		g100.noOfPlayers();
		g100.winner("DC");
		
		g100=new Chess();
		g100.play();
		g100.noOfPlayers();
		g100.winner("Viswanathan Anand");
		System.out.println("*******************************");
		
		

	}

}
