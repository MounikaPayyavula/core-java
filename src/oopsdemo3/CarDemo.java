package oopsdemo3;

public class CarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Details of Maruti cars : ");
		Maruti c1=new Maruti();
		c1.CarFeatures();
		c1.isAutomatic();
		c1.highTechAC();
		c1.modelName();
		
		System.out.println("-------------------------------");
		
		System.out.println("Details of Audi cars : ");
		Audi c2=new Audi();
		c2.CarFeatures();
		c2.isAutomatic();
		c2.highTechAC();
		c2.modelName();

	}

}
