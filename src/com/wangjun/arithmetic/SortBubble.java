package com.wangjun.arithmetic;

import java.util.Arrays;

/**
 * 冒泡排序
 * 
 * @author wangjun
 * @email scuwangjun@hotmail.com
 * @time 2018年4月5日 下午7:15:13
 */
public class SortBubble {

	public static void main(String[] args) {
		int[] arr = { 3, 1, 2, 4, 5, 6, 3, 1, 2, 4, 3};
		doBubble(arr);
		System.out.println(Arrays.toString(arr));
	}

	/*
	 * 冒泡排序的实现 
	 * 从小到大，冒到最后面 
	 * 第一个for循环次数，可以理解每个i的值是每次遍历最大值放的位置 第二个for进行冒泡交换
	 */
	public static void doBubble(int[] arr) {
		int len = arr.length;
		for(int i = 0; i < len; i++) {
			boolean isChange = false;
			for(int j = 0; j < len - i - 1; j++) {
				if(arr[j] > arr[j+1]) {
					arr[j] = arr[j] + arr[j+1];
					arr[j+1] = arr[j] - arr[j+1];
					arr[j] = arr[j] - arr[j+1];
					isChange = true;
				}
			}
			if(!isChange) {
				break;
			}
		}
	}

	/*
	 * 冒到最前面
	 */
	public static void doBubble2(int a[]) {
		int temp;
		int count = 0;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
