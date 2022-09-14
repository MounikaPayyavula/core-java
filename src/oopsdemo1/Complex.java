package oopsdemo1;

public class Complex {
	
	double real;
	double imaginary;
	//generate constructor using fields
	public Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	void add2(Complex obj)
	{
		//c1.real+=c2.real;
		this.real=this.real+obj.real;
		//c1.imaginary+=c2.imaginary;
		this.imaginary=this.imaginary+obj.imaginary;
	}		
	
	void add3(Complex obj1,Complex obj2)
	{
		
	
		//c1.real+=c2.real;
		this.real=this.real+obj1.real+obj2.real;
		//c1.imaginary+=c2.imaginary;
		this.imaginary=this.imaginary+obj1.imaginary+obj2.imaginary;
				
	}
	void display()
	{
		System.out.println("r"+this.real+" + i"+this.imaginary);
		
	}
	
	

}