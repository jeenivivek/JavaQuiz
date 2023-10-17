package com.quiz.impl;

import java.util.Scanner;

import com.quiz.constraints.QuizConstraints;
import com.quiz.inf.JavaQuizInf;

public class JavaQuestionImpl implements JavaQuizInf {

	@Override
	public void JavaBasicLevelQuestion() {
		String questionsAnswed;
		int count = 0;
	    String questions[] = {"1)What is the size of Int","How many method can an Abstract class have?","What is the default value of a String"};
	    String options[][] = { {"a)2 bytes","b)16 bytes","c)6 bytes","d)4 bytes"},
	    		{"a)One one","b)As Many as Required","c)Five","d)One two"},
	    		{"a)Null","b)1.0","c)0","d)None"}};
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
	public void JavaMediumLevelQuestions() {
		String questionsAnswed;
		int count = 0;
	    String questions[] = {"1)What is the result of the following code snippet?  int x = 5; int y = 2; double result = x / y;","Which of the following statements is true about the ArrayList class in Java?","Which of the following is not a feature of Java"};
	    String options[][] = { {" a) 2.5 ","b)2.0","c)2","d)Complilation Error"},
	    		{"a)Elements in ArrayList must be of the same data type.","b)ArrayList is a resizable array implementation of the List interface.","c)ArrayList cannot be resized once it is created. ","d) ArrayList is a final class and cannot be extended"},
	    		{"a)Dynamic","b)Architecture Neutral","c)Use of pointers","d)Object Oriented"}};
	    String answers[]= {"b","b","c"};
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
	public void JavaHighLevelQuestions() {
		String questionsAnswed;
		int count = 0;
	    String questions[] = {"1)Which of the following statements about Java interfaces is correct?","What is the main purpose of Java interfaces?","Which of the following statements about inheritance in Java is correct?\r\n"
	    		+ ""};
	    String options[][] = { {"a) Interfaces can have method implementations.","b) A class can implement multiple interfaces."," c) Interfaces can extend classes.","d) Interfaces can have instance variables"},
	    		{"a) To provide a way to achieve multiple inheritance in Java."," b) To define a blueprint for classes to implement methods.","c) To create objects in Java.","d) To enforce encapsulation in Java classes."},
	    		{"a) A subclass can access private members (fields and methods) of its superclass.","b) Constructors are not inherited in Java."," c) In Java, a class can inherit from multiple classes (multiple inheritance)."," d) Inheritance in Java is achieved through the use of the implements keyword."}};
	    String answers[]= {"b","b","c"};
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
