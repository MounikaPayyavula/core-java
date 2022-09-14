package assessmentpractical;

public class DaewooTruck implements Truck {
	
	int numberOfAxles;
	int totalWeight;
	String name="Daewoo Truck";
	
	public DaewooTruck(int numberOfAxles, int totalWeight) {
		this.numberOfAxles = numberOfAxles;
		this.totalWeight = totalWeight;
		
	}

	@Override
	public int noOfAxles() {
		
		return numberOfAxles;
	}

	@Override
	public int totalWeight() {
		
		return totalWeight;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
