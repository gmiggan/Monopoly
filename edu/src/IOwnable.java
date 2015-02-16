package src;

public interface IOwnable {

	public abstract Player getTheOwner();

	public abstract boolean isAvailable();

	public abstract void setAvailable(boolean available);

	public abstract void setTheOwner(Player owner);

}