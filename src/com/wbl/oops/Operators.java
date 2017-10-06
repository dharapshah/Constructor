package com.wbl.oops;

public class Operators {

	public static void main(String[] args) {
              
		int a = 40;
		int b = 5;

		int result = a+b;
		System.out.println("a+b:"+result);
		
		result = a-b;
		System.out.println("a-b:"+result);
		
		System.out.println("a*b:"+(a*b));
		System.out.println("a/b:"+(a/b));
		
		result = 4+5*6;
		System.out.println("result:" +result);
		
		//unary operators
		int i=10;
		System.out.println("post increment:" +(i++));
		System.out.println("post increment after statement:" +(i)); // next line value will be added

		System.out.println("prefix increment:" +(++i));// same line value will be added
		System.out.println("prefix increment after statement:" +(i));
		
		boolean b1=true;
		System.out.println("not on boolean:"+!b1); // ! is known as not  and is used in boolean only
		
		//equality or relational always evaluate to boolean - result will be true or false
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a!=b);
		System.out.println(a==b);
		System.out.println(a<+b);
		System.out.println(a>=b);
		
		a=250;
		b=25;
		int c=17;
		
		//logical or short circuit and and or 
		if(a>b && a>c){
			System.out.println("a is greater");//If a is not greater then b or c either off the ststement will not be printed
		
			if(a>b || a>c){
				System.out.println("a is greater");
			}
			
			//Ternary operator
			//if (a>b){
				result=a;
			}else{
				result=b;
			}//	
		
			result = a>b? a:b;
			System.out.println(result);
			
			//instanceof operator - to check object is instance of specific class or not
			parameterizedM P = new parameterizedM();
			if (P instanceof parameterizedM){
				System.out.println("P is instance of parameterizedM");
			}else{
				System.out.println("it is not instance");
			}
			
			//BITWISE OPERATORS
			
			int i1=6;
			
			
			
			
			
		
			
		
		
		
		
		
		

	}

}
