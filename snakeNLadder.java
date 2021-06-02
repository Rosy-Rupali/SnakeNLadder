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
		int player1Position = 0, diceValue=0, player1DiceCount=0;
		int player2Position = 0, player2DiceCount=0;
		int currentPlayer = -1;
		while(true) {
			diceValue = rollDie();
			if(currentPlayer == -1) {
			player1DiceCount++;
			player1Position = calculatePlayerPosition(player1DiceCount, diceValue);
			System.out.println("Player1 position: "+player1Position);
			if(player1Position == WIN_POINT) {
				System.out.println("Player1 wins the game");
				System.out.println("Die rolled: "+player1DiceCount);
				break;
			}
		}
		else {
			player2DiceCount++;
			player2Position = calculatePlayerPosition(player2DiceCount, diceValue);
			System.out.println("Player2 position: "+player2Position);
			if(player2Position == WIN_POINT) {
				System.out.println("Player2 wins the game");
				System.out.println("Die rolled: "+player2DiceCount);
				break;
			}
		}
			currentPlayer = -(currentPlayer);
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

