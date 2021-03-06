package com.wangjun.othersOfJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/** 
 * ArrayList的增删查改，遍历
 * @author wangjun 
 * @email  scuwangjun@hotmail.com
 * @time   2018年4月6日 下午2:25:43 
 */
public class ArrayListOperation {

	public static void main(String[] args) {
		//初始化
		List<String> list = new ArrayList<>();
		//增
		list.add("str1");
		list.add("str2");
		list.add("str3");
		//删
		list.remove(1);
		//查
		System.out.println("list的第二个元素是：" + list.get(1));
		//改
		list.set(0, "str11");
		System.out.println("最终的list：" + list.toString());
		//遍历1,使用for
		System.out.println("LinkedList遍历1,使用for:");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		//遍历2,使用增强for
		System.out.println("LinkedList遍历1,使用增强for:");
		for(String str: list) {
			System.out.println(str);
		}
		//遍历3，使用Iterator，集合类的通用遍历方式
		System.out.println("LinkedList遍历3，使用Iterator:");
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
