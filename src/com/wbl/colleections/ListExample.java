package com.wbl.colleections;

import java.util.ArrayList;//CTRL+SHIFT+O by placing cursor at firstlist.
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ListExample {
	
	public void listbasics(){
		
		List<String>firstlist = new ArrayList<String>();	//syntax to create list
		firstlist.add("one");
		firstlist.add("two");
		firstlist.add("abc");
		firstlist.add("null");
		
		
		

		for(int i=0;i<firstlist.size(); i++){;
		System.out.println(firstlist.get(i));
		}
		
		//or
		
		for (String fl: firstlist){;
		System.out.println(fl);
		}
		
		//or
		
		Iterator<String>itr = firstlist.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
	
	public void vectorexample(){
		Vector<String> vector = new Vector<String>();
		System.out.println("capacity initially::" + vector.capacity());
		vector.add("one1");
		vector.add("one2");
		vector.add("one3");
		vector.add("one4");
		vector.add("one5");
		vector.add("one6");
		vector.add("one7");
		vector.add("one8");
		vector.add("one9");
		vector.add("one10");
		vector.add("one11");
		System.out.println("capacity at the end::" + vector.capacity());
		
		
	}
	
	
	public static void main(String[] args) {
	ListExample le = new ListExample();
	le.vectorexample();

	}

}

	
	