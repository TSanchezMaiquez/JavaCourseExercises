package vehicle;

public class Motocycle implements Vehicle{

	private int speed;
	
	public Motocycle() {
		speed=10;
	}
	
	
	@Override
	public int getSeats() {
		
		return 2;
	}

	@Override
	public int getAccelerate() {
		
		return speed;
	}

	@Override
	public String setAccelerate(int accelerate) {
		if ((accelerate+speed)>MAXSPEED) {
			return "this speed exceeds the maximum permitted speed(120)";
		}else {
			speed=accelerate;
			return "the motocycle is accelerating to "+accelerate + " kms/h";
		}
		
	}

	@Override
	public void setStop(int accelerate) {
		speed = accelerate;
		
	}





}
