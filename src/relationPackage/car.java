package relationPackage;

public class car {
	private int maxSpeed;
	private String color;
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public void setColor(String color) {
		this.color = color;
	}
		
	public void carInformation() {
		System.out.println("Car Color::"+ color+ "maximum speed::" + maxSpeed);
	}
	

}
