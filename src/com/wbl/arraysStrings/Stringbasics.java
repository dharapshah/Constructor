package com.wbl.arraysStrings;

public class Stringbasics {

	public void Stringbasics(){
		/*String str = new String("hello");// string object is immutable means cannot be modify it.
		  String str = new String("hello");//it creates another string object with hello.
	     //str = str.concat("world");
		String str1 = str.concat("world");
		System.out.println(str);
		System.out.println(str1);*/
	
		
		
		/*String s = "hello";// this way of calling a string is known as string literal way.Above also works.
		String s1 = "hello";//its just points s1 to prev hello object*/
		
		//String s1 = new String ("java");will print both are not equal because it will use heap memory.
		//String s2 = new String ("java");
		String s1 = "java";// will print both are equal because it will use scpool
		String s2 = "java";
		//if (s1.equals(s2)){ to use with heap memory 
		if (s1==s2){
			System.out.println("Both are equal");
		}else{
			System.out.println("Both are not equal");
			
		}
			}
		
	
	
	public static void main(String[] args) {
        Stringbasics sb = new Stringbasics();
        sb.Stringbasics();

	}

}
