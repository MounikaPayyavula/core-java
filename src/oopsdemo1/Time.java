package oopsdemo1;
/* java prgm to perform addition of two times
 * t1-->12:45:55
 * t2-->10:30:30
 *             
 * t1+t2
 * if sec>60..mins should be incremented & sec -60
 *  if min>60..hrs should be incremented & min  -60
 * 
 */

public class Time {

	int hrs,min,sec;
	public Time()
	{
		hrs=min=sec=0;
		
	}
	
	public Time(int hrs, int min, int sec) {
		this.hrs = hrs;
		this.min = min;
		this.sec = sec;
	}
	void add(Time t)
	{
		this.sec+=t.sec;
		 if(this.sec>=60)
		 {
			 this.min+=1;
			 this.sec-=60;
			 }
		 this.min+=t.min;
		 if(this.min>=60)
		 {
			 this.hrs+=1;
			 this.min-=60;
			 }
		 this.hrs+=t.hrs;
		 }
	
		
	
	void display()
	{
		System.out.println(this.hrs+" : "+this.min+" : "+this.sec);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t1=new Time(12,45,55);
		Time t2=new Time(10,30,30);
		t1.add(t2);
		System.out.println("The addition of two times : ");
		t1.display();
		

	}

}
