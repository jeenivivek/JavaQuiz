package com.quiz.impl;

import java.util.Scanner;

import com.quiz.inf.QuizLevelInf;

public class QuizLevelImpl implements QuizLevelInf {
	String playerName;
	public String quizLevel() {
		String quizLevel;
		System.out.println("Please Select the Level of Quiz");
		System.out.println("1.Basic");
		System.out.println("2.Medium");
		System.out.println("3.Hard");
		Scanner sc = new Scanner(System.in);
		quizLevel = sc.next();
		System.out.println("Please Select the Level");
		return quizLevel;
	}

	@Override
	public void playerName() {
		System.out.println("Please Enter Your Name to Start the Quiz");
		 Scanner sc = new Scanner(System.in);
		 playerName = sc.next();
		 System.out.println("Hi " + playerName + " you are ready to start the Quiz");
		
		
	}
	

}
