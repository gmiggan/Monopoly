package src;

public abstract class Cell implements IOwnable {
	private String name;
	protected Player theOwner;

	public String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see src.IOwnable#getTheOwner()
	 */
	@Override
	public Player getTheOwner() {
		return theOwner;
	}

	public int getPrice() {
		return 0;
	}

	public abstract void playAction();

	/* (non-Javadoc)
	 * @see src.IOwnable#setAvailable(boolean)
	 */
	

	void setName(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see src.IOwnable#setTheOwner(src.Player)
	 */
	@Override
	public void setTheOwner(Player owner) {
		this.theOwner = owner;
	}

	public String toString() {
		return name;
	}
}
