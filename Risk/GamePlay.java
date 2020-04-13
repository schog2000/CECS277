package Risk;

public class GamePlay {
	private int playerTurn;
	public GamePlay() {
		
	}
	public int getPlayerTurn() {
		return playerTurn;
	}

	public static void main(String[] args) {
		StartUp connectSU = new StartUp();
		//DeployPhase connectDP = new DeployPhase();
		
		connectSU.createTer();
		connectSU.startPlayers();
		
		int playerTurn = connectSU.getStrtUpTrps().size();
		System.out.println(playerTurn + " people are playing.");

	}

}
