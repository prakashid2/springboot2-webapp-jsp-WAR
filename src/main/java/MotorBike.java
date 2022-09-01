
public class MotorBike {
	private int speed;
	
	int power;
	int mileage;
	
	MotorBike(int speed){
		this.speed = speed;
	}
	
	void start() {
		System.out.println("MotorBike started");
	}
	
	public void increaseSpeed(int howmuch) {
		this.speed+=howmuch;
	}
	
	public void decreaseSpeed(int howmuch) {
		if(this.speed-howmuch>0) {
			this.speed-=howmuch;
		}
	}
	
	public void setSpeed(int speed) {
		if(speed>0)
			this.speed = speed;
	}

	public int getSpeed() {
		return this.speed;
	}
	
	public int getPower()
	{
		return this.power;
	}
	
	public int getMileage()
	{
		return this.mileage;
	}
	
	
}
