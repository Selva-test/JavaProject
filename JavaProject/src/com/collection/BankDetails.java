package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class BankDetails {
	
	public static void main(String[] args) {
		
	Map<Integer, Object> m = new LinkedHashMap<>();
	
	m.put(0,10);
	m.put(1, 20);
	m.put(1, 30);//duplicate key //override
	m.put(2, 'c');
	m.put(3, "java");
	m.put(4, "java");//duplicate value
	m.put(null, 60);
	m.put(null, 70); //duplicate null in key
	m.put(5, null);
	m.put(6, null);
	
	System.out.println(m);
	
	Object object = m.get(2);
	System.out.println(object);
	
	boolean containsKey = m.containsKey(4);
	System.out.println(containsKey);
	
	boolean containsValue = m.containsValue("Java"); //case sensitive
	System.out.println(containsValue); 
	
	int size = m.size();
	System.out.println(size);
	
	Set<Integer> keySet = m.keySet();
	System.out.println(keySet);
	
	Collection<Object> values = m.values();
	System.out.println(values);
	
	
		
		
	}

}
