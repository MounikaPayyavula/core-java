
package oopsdemo2;

//has a relationship
//one way relationship

public class AggregationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Address ad1=new Address("Bengaluru", "Karnataka", "India", 566016);
Address ad2=new Address("Prague", "Austin", "Czech", 777777);

Student s1=new Student(101, "mouni", ad1);
Student s2=new Student(102, "lalli", ad2);

s1.display();
s2.display();
	}

}
