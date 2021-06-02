package snakeandladder;

import java.util.Random;

public  class snakeNLadder {
	
	Random random = new Random();
	
	int WIN_POINT=100;
	
	public static void main(String[] args) {
		
		snakeNLadder sn = new snakeNLadder();
		sn.startGame();
	}
	
	public void startGame() {
		int playerPosition = 0, diceValue=0;
		int playerDiceCount=0;
		while(true) {
			diceValue = rollDie();
			playerDiceCount++;
			playerPosition = calculatePlayerPosition(playerDiceCount, diceValue);
			System.out.println("Player position: "+playerPosition);
			if(playerPosition == WIN_POINT) {
				System.out.println("Player wins the game");
				System.out.println("Die rolled: "+playerDiceCount);
				break;
			}
		}
	}
	
	public int rollDie() {
		return random.nextInt(6)+1;
	}
	public int calculatePlayerPosition(int player, int diceValue) {
		if(player < WIN_POINT) {
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
			if(player < 0) {
				player = 0;
			}
		}
		else {
			player = player - diceValue;
		}
		return player;
	}
}

