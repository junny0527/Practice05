package com.javaex.ex05;

public class Print {
    
    public void printer(int val){
        System.out.println(val);
    }

    //메소드  3개 를 작성하세요
    public void printer(Boolean val){
      
        if(val == true) {
    		System.out.println(val);
    	}else {
    		System.out.println("");
    	}
    }
    public void printer(double val){
        System.out.println(val);
    }
    public void printer(String val){
        System.out.println(val);
    }
}
