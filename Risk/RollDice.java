package Risk;

import java.util.Random;
public class RollDice {
	public int roll() {
		Random diceRand = new Random();
		int dice;
		while(true) {
			dice = diceRand.nextInt(7);
			if(dice != 0) {
				break;
			}
		}
		return dice;
	}

}
