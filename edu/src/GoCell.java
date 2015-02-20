package src;

public class GoCell extends Cell {
	protected Player theOwner;

	public GoCell() {
		super.setName("Go");
		
	}

	public void playAction() {
	}

	void setName(String name) {
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
