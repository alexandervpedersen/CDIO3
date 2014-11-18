package FieldGame;

public class Fleet extends Ownable {
	private int rent_1 = 500;
	private int rent_2 = 1000;
	private int rent_3 = 2000;
	private int rent_4 = 4000;
	
	public Fleet() {
		
	}
	@Override
	public int getRent() {
		if (owner.getFleetammount() == 1)
			return rent_1;
		else if (owner.getFleetammount() == 2)
			return rent_2;
		else if (owner.getFleetammount() == 3)
			return rent_3;
		else if (owner.getFleetammount() == 4)
			return rent_4;
		else
			return 0;
	}
	// tilføj en metode, at man får 1+ i fleetammount når man køber en fleet.
}
