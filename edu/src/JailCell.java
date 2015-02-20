package src;

public class JailCell extends Cell {
	public static int BAIL = 50;
	protected Player theOwner;
	public JailCell() {
		setName("Jail");
	}

	public void playAction() {

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
