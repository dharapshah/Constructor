package com.wbl.colleections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	
	public void setBasis(){
		
		Set<String> firstset = new HashSet<String>();
		firstset.add("one");
		firstset.add("abc");
		firstset.add("hello");
		firstset.add("world");
		firstset.add("null");
		
	}
		
		
		
		public void LinkedHashsetBasis(){
			
			Set<String> firstset = new LinkedHashSet<String>();
			firstset.add("one");
			firstset.add("abc");
			firstset.add("hello");
			firstset.add("world");
			firstset.add("null");
			firstset.remove("one");
		}
	
		
		
			public void treesetbasis(){
			
			Set<String> firstset = new TreeSet<String>();
			firstset.add("a1");
			firstset.add("a2");
			firstset.add("a3");
			firstset.add("b1");
			firstset.add("b2");
		
		for(String fs: firstset){
			System.out.println(fs);
		}
			}
	
			public void setHashCodeImp(){
				Set<Student> set = new HashSet<Student>();
				Student s1  = new Student (1,"rohan");
			
			}
			
			
	public static void main(String[] args) {
		SetExample fs = new SetExample();
		fs.treesetbasis();
}
}


//The word linked will always give same as insertion order
// whenever the word tree is there it means its sorted.It will sort in alphabetical order/ascending
