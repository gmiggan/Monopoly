package src;

public abstract class OwnableCell extends Cell {

	private boolean available = true;
	protected Player theOwner;

	public OwnableCell() {
		super();
	}

	
	public boolean isAvailable() {
		return available;
	}

	
	public void setAvailable(boolean available) {
		this.available = available;
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