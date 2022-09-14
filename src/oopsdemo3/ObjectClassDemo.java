package oopsdemo3;

public class ObjectClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object oc=new Object();//create a object of object class
		System.out.println(oc.hashCode());
		System.out.println(oc.toString());
		System.out.println(oc.getClass());
		Employee e1=new Manager("mouni", 5000, "IT", "ABC");
		System.out.println(e1.getClass());
		Object oc1=new Object();
		System.out.println(oc1.equals(oc));
		System.out.println(oc1.hashCode());
		System.out.println(oc1.toString());
		Object oc2=oc;
		System.out.println(oc2.equals(oc));
		
		Student s1= new Student(101, "mouni");
		Student s2= new Student(101, "mouni");
		s1=s2;
		System.out.println(s1.getClass());
		System.out.println(s1.equals(s2));
		
		
		String s="Java";
		String v="Java";
		String k=new String("Java");
		System.out.println(s.equals(v));
		System.out.println(s.equals(k));  //checks content
		System.out.println(s==k);         //checks reference
		System.out.println(s==v);
		
		
		ObjectClassDemo obj= new ObjectClassDemo();
		System.out.println(obj.toString());
		
		
		
		
		
	}

}
