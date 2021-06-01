package snakeandladder;

import java.util.Random;

public  class snakeNLadder {
	
	Random random = new Random();
	int playerPosition = 0;
	
	public int rollDie() {
		return random.nextInt(6)+1;
	}
	public int calculatePlayerPosition(int player, int diceValue) {
		int checkPlay;
		checkPlay = random.nextInt(3);
		switch(checkPlay) {
		case 0:
			System.out.println("no play");
			break;
		case 1:
			System.out.println("ladder");
			player = player + diceValue;
			break;
		default:
			System.out.println("snake");
			player = player - diceValue;
			break;
		
		}
		return player;
	}
}

