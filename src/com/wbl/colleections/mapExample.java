package com.wbl.colleections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class mapExample {
	
	public void mapBasis(){
		
		Map<Integer,String> map = new HashMap <Integer,String>();
		map.put(134300,  "Sunil");//keys should be unique, value can be duplicate.
		map.put(106,  "ahad");
		map.put(1546565, "gayathri");
		map.put(374627, "harini");
		map.put(106, "rima");
		map.put(7585, "null");//value can have multiple null but key only one null 
		
		
		/*
		 * for(Map.Entry<Integer, String> mapEntry : map.entrySet()){
			System.out.println("Key::" + mapEntry.getKey() + "; Value::" + mapEntry.getValue());
				}*/
		
		System.out.println(map.get(new Integer (106)));
		
		
		Map<Student,Integer> map1 = new HashMap <Student,Integer>();
		Student s1 = new Student(1, "rohan");
		Student s2 = new Student(2, "ria");
		map1.put(s1, 500);
		map1.put(s2, 600);
		
		Student key = new Student (1, "rohan");
		System.out.println(key.hashCode()+ ":" +s1.equals(key));
		System.out.println(map1.get(key));	
		
	}
		
		public void mapOthers(){ // insertion order will remain same
			
			Map<Integer,String> map = new LinkedHashMap <Integer,String>();
			map.put(134300,  "Sunil");//keys should be unique, value can be duplicate.
			map.put(106,  "ahad");
			map.put(1546565, "gayathri");
			map.put(374627, "harini");
			map.put(106, "rima");
			map.put(7585, "null");//value can have multiple null but key only one null 
			
			
		
			for(Map.Entry<Integer, String> mapEntry : map.entrySet()){
			System.out.println("Key::" + mapEntry.getKey() + "; Value::" + mapEntry.getValue());
					}
			
		}
		
		public void Treemap(){ // insertion order will remain same
				
			Map<Integer,String> map = new TreeMap <Integer,String>();
			map.put(134300,  "Sunil");//keys should be unique, value can be duplicate.
			map.put(106,  "ahad");
			map.put(1546565, "gayathri");
			map.put(374627, "harini");
			map.put(106, "rima");
			map.put(7585, "null");//value can have multiple null but key only one null 
				
				
			
		for(Map.Entry<Integer, String> mapEntry : map.entrySet()){
		System.out.println("Key::" + mapEntry.getKey() + "; Value::" + mapEntry.getValue());
						}
				
	}		
		public static void main(String[] args) {
			mapExample mp = new mapExample();
			mp.Treemap();
			
		
	}
	

}
