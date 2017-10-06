package com.wbl.oops;

public class Loops {

	public void printMathsTable(int input){
		
		// Basic Example of how to use while.
		/*int i = 1;
		while (i<10){
			System.out.println(i);
			i++; // i=i+1 to check till no 9 as i=1
		}*/
		

		}
		
		/*int i=1;
		while(i<=10){
	 System.out.println(input+" * "+i+" = "+(input*i));
	 i++;
		}*/
		
		
	
	/*public void forLoop(){
		int i;
		for(i=1; i<=10;i++){
			System.out.println(i);
			
		}
	}*/
	
	public void printStars(int input){

		for(int i=1; i<=input; i++){
		for (int j=1; j<=i; j++){
			System.out.print("*");
		}
		System.out.println();
	
		}
	}

public static void main (String[] args){
	Loops l = new Loops();
			//l.printMathsTable(5);
	//l.forLoop();
	l.printStars(5);
}

}
