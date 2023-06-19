package vehicle;

public interface Vehicle {
	
	public static int MAXSPEED = 120;
	
	public int getSeats ();
	public int getAccelerate();
	public String setAccelerate(int accelerate);
	public void setStop(int accelerate);

}
