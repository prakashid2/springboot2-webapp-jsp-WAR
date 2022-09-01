
public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike harley = new HarleyDavidson(100);
		MotorBike honda = new Honda(50);
		MotorBike ducati = new Ducati(50);
		
		harley.start();
		honda.start();
		
		harley.setSpeed(-100); //if(speed>0) harley.speed =speed
		honda.setSpeed(-80); //if(speed>0) honda.speed =speed
		
		harley.decreaseSpeed(50);   //if(harley.speed-howmuch>0) harley.speed-=howmuch
		honda.decreaseSpeed(25);	//if(honda.speed-howmuch>0) honda.speed-=howmuch	
		
		harley.increaseSpeed(50);
		honda.increaseSpeed(25);
		ducati.increaseSpeed(30);
		
		
		System.out.println("harley speed "+harley.getSpeed());
		System.out.println("honda speed "+honda.getSpeed());
		System.out.println("ducati speed "+ducati.getSpeed());

		System.out.println("harley power "+harley.getPower());
		System.out.println("honda power "+honda.getPower());
		System.out.println("ducati power "+ducati.getPower());
		
		System.out.println("harley mileage "+harley.getMileage());
		System.out.println("honda mileage "+honda.getMileage());
		System.out.println("ducati mileage "+ducati.getMileage());		
	}

}
