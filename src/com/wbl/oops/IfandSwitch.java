package com.wbl.oops;

public class IfandSwitch {

	public void multipleofThreeandFive(int input){

		if(input%3==0 && input%5==0){
			System.out.println(input+ " is divisible by 3 and 5");
		}else if (input%3==0){
			System.out.println(input+ " It is divisible by 3");
		}else if (input%5==0){
			System.out.println(input+ " It is divisible by 5");
		}else
				System.out.println(input+ " It is not divisible by 3 and 5");
	}
	
	
	public void switchCase(String input){ 
	 
		switch(input){
		case "mon":
			System.out.println("It is monday");
			break;// if break is not mentioned after every case it will continue even after result is found
		case "tue":
			System.out.println("It is tuesday");
			break;
		case "wed":
			System.out.println("It is wednesday");
			break;
		case "thu":
			System.out.println("It is thursday");
			break;
		case "fri":
			System.out.println("It is friday");
			break;
		case "sat":
			System.out.println("It is saturday");
			break;
		case "sun":
			System.out.println("It is sunday");
			break;
	default:
		System.out.println("none of the conditions matched");
		}
		System.out.println("end of switch case...");		
		}

	
	public static void main(String[]args){
		IfandSwitch ifs = new IfandSwitch();
		ifs. multipleofThreeandFive(15);
		//ifs. switchCase("wed");
		
		
	}
	}

		
		