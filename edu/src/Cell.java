package src;

public abstract class Cell implements IOwnable {
	private boolean available = true;
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

	/* (non-Javadoc)
	 * @see src.IOwnable#isAvailable()
	 */
	@Override
	public boolean isAvailable() {
		return available;
	}

	public abstract void playAction();

	/* (non-Javadoc)
	 * @see src.IOwnable#setAvailable(boolean)
	 */
	@Override
	public void setAvailable(boolean available) {
		this.available = available;
	}

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
