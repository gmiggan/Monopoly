package src;

public class CardCell extends Cell {
	private int type;
	protected Player theOwner;
	

	public CardCell(int type, String name) {
		setName(name);
		this.type = type;
	}

	public void playAction() {
	}

	public int getType() {
		return type;
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
