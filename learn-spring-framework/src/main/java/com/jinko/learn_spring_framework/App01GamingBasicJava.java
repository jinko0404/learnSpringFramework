package com.jinko.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jinko.learn_spring_framework.game.GameRunner;
import com.jinko.learn_spring_framework.game.MarioGame;
import com.jinko.learn_spring_framework.game.PacmanGame;
import com.jinko.learn_spring_framework.game.SuperContraGame;


public class App01GamingBasicJava {

	public static void main(String[] args) {
		//var game = new MarioGame();
		//var game = new SuperContraGame();
		var game = new PacmanGame();//객체 생성
		var gameRunner = new GameRunner(game);
		//객체 생성 + 의존성 주입
		//game은 gameRunner의 의존성
		
		gameRunner.run();
	}
}
