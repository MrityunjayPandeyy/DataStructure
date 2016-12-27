package com.mrityunjay.collection;

import java.util.Comparator;

public class CompareWithName implements Comparator<ComparatorPojo>{
	String name;

	@Override
	public int compare(ComparatorPojo o1, ComparatorPojo o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
