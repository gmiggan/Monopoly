package src;

public abstract class OwnableCell extends Cell {

	private boolean available = true;

	public OwnableCell() {
		super();
	}

	
	public boolean isAvailable() {
		return available;
	}

	
	public void setAvailable(boolean available) {
		this.available = available;
	}

}