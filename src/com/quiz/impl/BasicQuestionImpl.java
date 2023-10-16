package com.quiz.impl;

import java.util.Scanner;


import com.quiz.inf.BasicLevelQuizInf;

public class BasicQuestionImpl implements BasicLevelQuizInf {
	public void Question() {
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
    			count++;
    		}  	
        }
        System.out.println("Your Total Score is " + count + "/" + options.length);
        
	    
	    }


	
	   
		
	}
