package com.quiz.impl;

import java.util.Scanner;

import com.quiz.constraints.QuizConstraints;
import com.quiz.inf.SQLQuizInf;

public class SQLQuestionImpl implements SQLQuizInf {

	@Override
	public void SQLBasicLevelQuestion() {
		String questionsAnswed;
		int count = 0;
	    String questions[] = {"1)What is the full form of SQL?","What is the full form of SQL?","What is the full form of SQL?"};
	    String options[][] = { {"a)What is the full form of SQL?","b)Structure Query Language","c)Sample Query Language","d)None of these"},
	    		{"a)FLOAT","b)NUMERIC","c)DECIMAL","d)CHARACTER"},
	    		{"a)TRUNCATE","b)ALTER","c)CREATE","d)DELETE"}};
	    String answers[]= {"b","c","d"};
        for(int i=0;i<options.length;i++) {
        	System.out.println(questions[i]);
        	for(int j=0;j<4;j++) {
        		System.out.println(options[i][j]);
        	}
        	Scanner option = new Scanner(System.in);
    		questionsAnswed = option.next();
    		if(questionsAnswed.equals(answers[i])) {
    			count = count + 5;
    		}
    		else {
    			count--;
    		}	 	
        }
        System.out.println("Your Total Score is " + count + "/" + QuizConstraints.QUIZSCORE);
		
	}

	@Override
	public void SQLMediumLevelQuestions() {
		String questionsAnswed;
		int count = 0;
	    String questions[] = {"1) Which statement is used to delete all rows in a table without having the action logged??","How many Primary keys can have in a table?"};
	    String options[][] = { {"a)DELETE","b)REMOVE","c)DROP","d)TRUNCATE"},
	    		{"a)Simple tables","b)Virtual tables","c)Actual tables","d)Complex tables"},
	    		{"a)Only one","b)Two","c)As many as Require","d)Depends on no of Columns"}};
	    String answers[]= {"d","b","a"};
        for(int i=0;i<options.length;i++) {
        	System.out.println(questions[i]);
        	for(int j=0;j<4;j++) {
        		System.out.println(options[i][j]);
        	}
        	Scanner option = new Scanner(System.in);
    		questionsAnswed = option.next();
    		if(questionsAnswed.equals(answers[i])) {
    			count = count + 5;
    		}
    		else {
    			count--;
    		}	 	
        }
        System.out.println("Your Total Score is " + count + "/" + QuizConstraints.QUIZSCORE);
		
	}

	@Override
	public void SQLHighLevelQuestions() {
		String questionsAnswed;
		int count = 0;
	    String questions[] = {"1) Which of the following is not a valid aggregate function?","Which data manipulation command is used to combines the records from one or more tables?"," Which operator is used to compare a value to a specified list of values?"};
	    String options[][] = { {"a)COUNT","b)COMPUTE","c)ADD","d)MAX"},
	    		{"a)SELECT","b)PRODUCT","c)JOIN","d)PROJECT"},
	    		{"a)ANY","b)BETWEEN","c)ALL","d)IN"}};
	    String answers[]= {"b","c","d"};
        for(int i=0;i<options.length;i++) {
        	System.out.println(questions[i]);
        	for(int j=0;j<4;j++) {
        		System.out.println(options[i][j]);
        	}
        	Scanner option = new Scanner(System.in);
    		questionsAnswed = option.next();
    		if(questionsAnswed.equals(answers[i])) {
    			count = count + 5;
    		}
    		else {
    			count--;
    		}	  	
        }
        System.out.println("Your Total Score is " + count + "/" + QuizConstraints.QUIZSCORE);
		
	}

	

}
