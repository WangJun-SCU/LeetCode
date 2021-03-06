package com.wangjun.othersOfJava;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/** 
 * TreeSet的增删遍历
 * @author wangjun 
 * @email  scuwangjun@hotmail.com
 * @time   2018年4月7日 下午4:36:02 
 */
public class TreeSetOperation {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		//增
		set.add("a");
		set.add("f");
		set.add("e");
		set.add("z");
		//删
		set.remove("key1");
		//遍历1
		//使用set.descendingIterator()方法可以反向遍历
		System.out.println("HashSet遍历1,使用Iterator:");
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//遍历2
		System.out.println("HashSet遍历2,使用for：");
		for(String str: set) {
			System.out.println(str);
		}
	}

}
