package assignment;
 class RoomTest
{
	 // attributes

	private int roomNo;
	private String roomType;
	private float roomArea;
	private boolean acMachine;
	
    //member functions
	
	public void setdata(int rNo,String rType,float rArea,boolean acMachine)
	{
		this.roomNo=rNo;
		this.roomType=rType;
		this.roomArea=rArea;
		this.acMachine=acMachine;
	}
	public void displayData()
	{
		System.out.println("Room No    : "+roomNo);
		System.out.println("Room Type  : "+roomType);
		System.out.println("Room Area  : "+roomArea);
		System.out.println("AcMachine  : "+acMachine);
	}
}

 public class Room {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RoomTest r1=new RoomTest();
		r1.setdata(100,"single",543.5f,true);
		r1.displayData();
		
		

	}

}
