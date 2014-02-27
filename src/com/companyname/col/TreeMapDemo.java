package com.companyname.col;

import java.util.Map;
import java.util.TreeMap;

class TreeMapDemo
{
	public static void main(String[] args)
	{
		Map<String, Integer> msi = new TreeMap<>();
		/*
		 * The TreeMap class provides a map implementation that is based on a red-black tree. As a result, entries
are stored in sorted order of their keys. However, accessing these entries is somewhat slower than with
the other Map implementations (which are not sorted) because links must be traversed
		 */
		String[] fruits = {"apples", "pears", "grapes", "bananas", "kiwis"};
		int[] quantities = {10, 15, 8, 17, 30};
		for (int i = 0; i < fruits.length; i++)
			msi.put(fruits[i], quantities[i]);
		for (Map.Entry<String, Integer> entry: msi.entrySet())
			System.out.println(entry.getKey()+": "+entry.getValue());
	}
}
