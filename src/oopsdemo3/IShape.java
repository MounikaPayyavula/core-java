package oopsdemo3;

public interface IShape {
	
	//implicitly public,static and final
	public String LABLE="shape";
	
	//interface methods  are implicitly abstract and public
	void draw();
	
	public abstract double getArea();
	

}
