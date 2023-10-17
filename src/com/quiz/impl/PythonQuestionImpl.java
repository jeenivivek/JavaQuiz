package com.quiz.impl;

import java.util.Scanner;

import com.quiz.constraints.QuizConstraints;
import com.quiz.inf.PythonQuizInf;

public class PythonQuestionImpl implements PythonQuizInf {

	@Override
	public void PythonBasicLevelQuestion() {
		String questionsAnswed;
		int count = 0;
	    String questions[] = {"1)Which one of the following is the correct extension of the Python file?","What is the maximum possible length of an identifier?","Who developed the Python language?"};
	    String options[][] = { {"a).Py","b).python","c).p","d)None of the above"},
	    		{"a)32","b)2","c)1","d)None of the above"},
	    		{"a)Zim Den","b)Zim Den","c)Zim Den","d)Wick van Rossum"}};
	    String answers[]= {"a","d","b"};
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
	public void PythonMediumLevelQuestions() {
		String questionsAnswed;
		int count = 0;
	    String questions[] = {"1)What is the method inside the class in python language?","Why does the name of local variables start with an underscore discouraged?","Which of the following is not a keyword in Python language?"};
	    String options[][] = { {"a)Object","b)Function","c)Attribute","d)Arguement"},
	    		{"a)To identify the variable","b)To identify the variable","c)It indicates a private variable of a class","d)None of the above"},
	    		{"a)val","b)raise","c)try","d)with"}};
	    String answers[]= {"b","c","a"};
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
	public void PythonHighLevelQuestions() {
		String questionsAnswed;
		int count = 0;
	    String questions[] = {"1)Which of the following declarations is incorrect in python language?","Which of the following functions is a built-in function in python language?","What will be the output of this function"};
	    String options[][] = { {"a)xyzp = 5,000,000","b)xyzp = 5,000,000","c)x,y,z,p = 5000, 6000, 7000, 8000","d)x_y_z_p = 5,000,000"},
	    		{"a)val()","b)pay()","c)print()","d)None of these"},
	    		{"a)True","b)0","c)null","d)False"}};
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
