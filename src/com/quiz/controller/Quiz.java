package com.quiz.controller;

import java.util.Scanner;

import com.quiz.constraints.QuizConstraints;
import com.quiz.impl.BasicQuestionImpl;
import com.quiz.impl.QuizLevelImpl;
import com.quiz.inf.BasicLevelQuizInf;

public class Quiz {
	
	public static void main(String[] args) {
		QuizLevelImpl quizLevelImpl = new QuizLevelImpl();
		quizLevelImpl.playerName();
		String quizLevel = quizLevelImpl.quizLevel();
		if(quizLevel.equals(QuizConstraints.BASICLEVEL)) {
		BasicQuestionImpl basicQuestion = new BasicQuestionImpl();
		basicQuestion.Question();
		}
	}
	
	

	
	

}
