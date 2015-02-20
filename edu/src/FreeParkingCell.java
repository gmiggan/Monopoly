package src;

public class FreeParkingCell extends Cell {

	

	protected Player theOwner;

	public FreeParkingCell() {
		setName("Free Parking");
	}

	public void playAction() {
		return;
	}

	@Override
	public Player getTheOwner() {
		return theOwner;
	}

	@Override
	public void setTheOwner(Player theOwner) {
		this.theOwner = theOwner;
	}

	
}
