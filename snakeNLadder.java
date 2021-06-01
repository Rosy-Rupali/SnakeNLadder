package snakeandladder;

import java.util.Random;

public  class snakeNLadder {
	
	Random random = new Random();
	int player = 0;
	
	
	public int rollDie() {
		return random.nextInt(6)+1;
	}
}