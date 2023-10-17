package com.quiz.controller;

import java.util.Scanner;

import com.quiz.constraints.QuizConstraints;
import com.quiz.impl.JavaQuestionImpl;
import com.quiz.impl.PythonQuestionImpl;
import com.quiz.impl.QuizLevelImpl;
import com.quiz.impl.SQLQuestionImpl;


public class Quiz {
	
	public static void main(String[] args) {
		QuizLevelImpl quizLevelImpl = new QuizLevelImpl();
		quizLevelImpl.playerName();
		String programmingLanguage = quizLevelImpl.quizLanguage();
		String quizLevel = quizLevelImpl.quizLevel();
		if(programmingLanguage.equals(QuizConstraints.JAVAQUIZ)) {
		    if(quizLevel.equals(QuizConstraints.BASICLEVEL)) 
		    {
		    	JavaQuestionImpl basicQuestion = new JavaQuestionImpl();
		       basicQuestion.JavaBasicLevelQuestion();
		    }
		    else if(quizLevel.equals(QuizConstraints.MEDIUMLEVEL))
		    {
		    	JavaQuestionImpl mediumLevelQuestion = new JavaQuestionImpl();
		    	mediumLevelQuestion.JavaMediumLevelQuestions();
			}
		
	        else  if(quizLevel.equals(QuizConstraints.BASICLEVEL)) {
	        	JavaQuestionImpl highLevelQuestion = new JavaQuestionImpl();
	        	highLevelQuestion.JavaHighLevelQuestions();
			}
		}else if(programmingLanguage.equals(QuizConstraints.SQLQUIZ)) {
		    if(quizLevel.equals(QuizConstraints.BASICLEVEL)) 
		    {
		    	SQLQuestionImpl basicQuestion = new SQLQuestionImpl();
		         basicQuestion.SQLBasicLevelQuestion();
		    }
		    else if(quizLevel.equals(QuizConstraints.MEDIUMLEVEL))
		    {
		    	SQLQuestionImpl mediumLevelQuestion = new SQLQuestionImpl();
		    	mediumLevelQuestion.SQLMediumLevelQuestions();
			}
		
	        else  if(quizLevel.equals(QuizConstraints.BASICLEVEL)) {
	        	SQLQuestionImpl highLevelQuestion = new SQLQuestionImpl();
	        	 highLevelQuestion.SQLHighLevelQuestions();
			}
		}
		else if(programmingLanguage.equals(QuizConstraints.PYTHONQUIZ)) {
		    if(quizLevel.equals(QuizConstraints.BASICLEVEL)) 
		    {
		    	PythonQuestionImpl basicQuestion = new PythonQuestionImpl();
		         basicQuestion.PythonBasicLevelQuestion();
		    }
		    else if(quizLevel.equals(QuizConstraints.MEDIUMLEVEL))
		    {
		    	PythonQuestionImpl mediumLevelQuestion = new PythonQuestionImpl();
		    	mediumLevelQuestion.PythonMediumLevelQuestions();
			}
		
	        else  if(quizLevel.equals(QuizConstraints.HIGHLEVEL)) {
	        	PythonQuestionImpl highLevelQuestion = new PythonQuestionImpl();
	        	 highLevelQuestion.PythonHighLevelQuestions();
			}
		}
		}
		
	}
	
	
	

	
	


