package com.jinko.learn_spring_framework.game;

public class GameRunner {
	private GamingConsole game;
	
	public GameRunner() {}
	
	public GameRunner(GamingConsole game) {
		this.setGame(game);
	}

	public GamingConsole getGame() {
		return game;
	}

	public void setGame(GamingConsole game) {
		this.game = game;
	}
	
	public void run() {
		System.out.println("Running game: " + game);
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
