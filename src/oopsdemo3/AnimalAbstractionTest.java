package oopsdemo3;
abstract class Animal
{
	public void eat()
	{
		System.out.println("I can eat");
	}
	abstract void makeSound(); //abstract method --without body
}
class Dog extends Animal
{

	@Override
	void makeSound() {
	System.out.println("Bark.....Bark.....");
		
	}
	
}
class Cat extends Animal
{

	@Override
	void makeSound() {
		System.out.println("Meow...Meow...");
		
	}
	
}

public class AnimalAbstractionTest {

	public static void main(String[] args) {
		// compiler error---cannot create instance of abstract class
		//Animal a=new Animal();
		Animal dog=new Dog();
		
		dog.eat();
		dog.makeSound();
		
		Cat c1=new Cat();
		c1.eat();
		c1.makeSound();
		
		

	}

}
