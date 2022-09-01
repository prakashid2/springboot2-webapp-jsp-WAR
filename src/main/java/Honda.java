
public class Honda extends MotorBike{
	
	Honda(int speed){		
		super(speed);
		this.power = 200;
		this.mileage = 60;
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
