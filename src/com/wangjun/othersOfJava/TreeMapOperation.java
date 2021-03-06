package com.wangjun.othersOfJava;

import java.util.TreeMap;

/** 
 * @author wangjun 
 * @email  scuwangjun@hotmail.com
 * @time   2018年4月6日 下午5:12:38 
 */
public class TreeMapOperation {

	public static void main(String[] args) {
		//初始化
		TreeMap<String,String> map = new TreeMap<>();
		//增
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		//删
		map.remove("key2");
		//查
		System.out.println("key1对应的valve为：" + map.get("key1"));
		//改
		map.replace("key3", "value33");
		System.out.println("最终的map是：" + map.toString());
	}

}
