package vehicle;

public class UseVehicle {

	public static void main(String[] args) {
		
		Vehicle [] vehicles = new Vehicle [4];
		vehicles[0]= new Car();
		vehicles[1]= new Car();
		vehicles[2]= new Motocycle();
		vehicles[3]= new Motocycle();
		
		System.out.println("Number of places: "+vehicles[0].getSeats());
		System.out.println("Current speed: "+vehicles[1].getAccelerate());
		System.out.println(vehicles[2].setAccelerate(130));
		System.out.println(vehicles[1].setAccelerate(110));
		vehicles[3].setStop(40);
		System.out.println("Current speed: "+vehicles[3].getAccelerate());
		

	}

}
