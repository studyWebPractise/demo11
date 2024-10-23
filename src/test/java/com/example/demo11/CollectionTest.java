package com.example.demo11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

public class CollectionTest {

	@Test
	public void test1() {
		List<String> listStr = new ArrayList<>();
		listStr.add("A");
		listStr.add("B");
		listStr.add("B");
		listStr.add("C");
		for (int i = 0; i < listStr.size(); i++) {
//			System.out.println(listStr.get(i));
			System.out.println(i);
			if (listStr.get(i) == "B") {
				listStr.remove(i);
			}
			System.out.println(listStr.get(i));
//			System.out.println(listStr.size());
			System.out.println();
		}
	}

	@Test
	public void test2() {
		List<String> list1 = new ArrayList<>();
		list1.add("A");
		list1.add("B");
		list1.add("C");

		List<String> list2 = new ArrayList<>();
		list2.add("A");
		list2.add("D");
		list2.add("E");
		list1.removeAll(list2);
		System.out.println(list1); // list1=[[B, C]]
	}

	@Test
	public void test3() {
		List<String> list1 = new ArrayList<>();
		list1.add("A");
		list1.add("B");
		list1.add("C");

		LinkedList<String> list2 = new LinkedList<>();
		list2.add("A");
		list2.add("D");
		list2.add("E");

		System.out.println(list1.get(list1.size() - 1));
		System.out.println(list2.getLast());

	}

	@Test
	public void linkedHashSetTest() {
		Set<String> setStr = new LinkedHashSet<String>();
		setStr.add("A");
		setStr.add("B");
		setStr.add("C");
		setStr.add("A");
		for (String temp : setStr) {
			System.out.println(temp);
		}
	}

	@Test
	public void Test3() {
		Random random = new Random();
		TreeSet<Integer> setInt = new TreeSet<Integer>();
		TreeSet<Integer> setInt2 = new TreeSet<>(new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
//				return - o1.compareTo(o2);
				return o2.compareTo(o1);
			}
		});

		while (setInt.size() < 5) {
			int number = random.nextInt(1, 11);
			setInt.add(number);
			setInt2.add(number);
		}
		System.out.println("程计:" + setInt.first());
		System.out.println("程计:" + setInt.last());
		System.out.println("パ:" + setInt);

		System.out.println("パ:" + setInt2);
//		Collections.reverse((List<Integer>) setInt);
//		System.out.print("パ: [");
//		while (setInt.size() > 0) {
//			System.out.print(setInt.last());
//			setInt.remove(setInt.last());
//			if (setInt.size() != 0) {
//				System.out.print(", ");
//			}
//		}
//		System.out.println("]");

	}

	@Test
	public void mapTest() {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		for (Entry<Integer, String> item : map.entrySet()) {
			System.out.println(item.getKey());
			System.out.println(item.getValue());
		}

		for (Integer item : map.keySet()) {
			System.out.println("key" + item);
			System.out.println("value" + map.get(item));
		}
	}

	@Test
	public void HW() {
		List<Integer> number = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("块肈ヘ(硆腹,だ筳):");
		
		number.add(2);
		number.add(7);
		number.add(5);
		number.add(3);

		int target = 10;

		for (int i = 0; i < number.size(); i++) {
			int find = number.indexOf(target - number.get(i));
			if (find != -1 && find != i) {
				System.out.println("[" + i + "," + find + "]");
				return;
			}

		}
		System.out.println("No find");
	}

}
