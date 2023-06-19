package vehicle;

public class Car implements Vehicle{

	private int speed;
	
	public Car () {
		speed=10;
	}
	
	@Override
	public int getSeats() {
		
		return 5;
	}

	@Override
	public int getAccelerate() {
		
		return speed;
	}

	@Override
	public String setAccelerate(int accelerate) {
		if ((accelerate+speed) > MAXSPEED) {
			return "that speed exceeds the maximum permitted speed(120)";
		}
		else{
			speed+=accelerate;
			return "the car is accelerating to "+accelerate +" kms/h";
		}
		}
		


	@Override
	public void setStop(int slowDown ) {
	
		speed-=slowDown;
	}

}
