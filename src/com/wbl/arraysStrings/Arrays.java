package com.wbl.arraysStrings;

public class Arrays {

	public void arrays(){
		// declaration of arrays and also creating array object
		
		//method 1 
		
		int[] studentIds = new int[5];// size should always go at your object creation step ie int[5] last word
		// giving the parantheses after data type int[] you should undstd that its an array object and not a normal int
		
		// assign data to array
		studentIds[0]=100;
		studentIds[1]=101;
		studentIds[2]=103;
		studentIds[3]=103;
		studentIds[4]=104;
		
		//iterate array data
		for(int i=0; i<studentIds.length; i++){
			System.out.println("doing logic on array data::"+studentIds[i]);
		}
	
	
	//method 2
	int[] empIds = {23,24,25,26,28}; //combining declaration and initialization at one step
	for(int i=0; i<empIds.length; i++){
	System.out.println("emp id::"+empIds[i]);
		}
	
	
	//method 3 anonymous array
		int[] ids = new int []{45,48,49,51,53}; //

		for(int i=0; i<ids.length; i++){
		System.out.println("id::"+ids[i]);
			}

		
		// string array
		String[] strArr = {"sanita", "blessy", "babita"};
		for(String str: strArr){
			System.out.println(str);
		}
		
		
		
		
		//User define object array, this will not run because Mobile class is not created.
		

	
		
	}

	
	public static void main(String[] args) {
		Arrays arr = new Arrays();
		arr.arrays();
		

	}
}



