package com.mrityunjay.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {

	public static void main(String[] args) {
		List<ComparatorPojo> integerList=new ArrayList<ComparatorPojo>();
		integerList.add(new ComparatorPojo(1,"one"));
		integerList.add(new ComparatorPojo(3,"three"));
		integerList.add(new ComparatorPojo(2,"two"));
		integerList.add(new ComparatorPojo(4,"four"));
		
		
		System.out.println("Initial List element");
		for(ComparatorPojo temp: integerList){
			System.out.println(temp.getId() +"-"+temp.getName());
		}
		System.out.println("List element after sorting by name");
		Collections.sort(integerList,new CompareWithName());		  

		for(ComparatorPojo temp: integerList){
			System.out.println(temp.getId() +"-"+temp.getName());
		}

		
		Collections.sort(integerList,new Comparator<ComparatorPojo>() {
			@Override
			public int compare(ComparatorPojo o1, ComparatorPojo o2) {
				return ((Integer)o1.getId()).compareTo((Integer)o2.getId());
			}
		});
		System.out.println("List element after sorting by id");
		for(ComparatorPojo temp: integerList){
			System.out.println(temp.getId() +"-"+temp.getName());
		}		

	}

}
