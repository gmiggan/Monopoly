package src;

public class GoToJailCell extends Cell {

	

	

	public GoToJailCell() {
		setName("Go to Jail");
	}

	public void playAction() {
		Player currentPlayer = GameMaster.instance().getCurrentPlayer();
		GameMaster.instance().getGameBoard()
				.queryCell("Jail");
		GameMaster.instance().sendToJail(currentPlayer);
	}

	@Override
	public Player getTheOwner() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTheOwner(Player owner) {
		// TODO Auto-generated method stub
		
	}

	

	
}
