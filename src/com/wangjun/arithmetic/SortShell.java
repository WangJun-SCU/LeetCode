package com.wangjun.arithmetic;

import java.util.Arrays;

/*
 * shell排序
 */
public class SortShell {

	public static void main(String[] args) {
		int[] arr = {2,3,7,5,43,8,9,0,3,1};
		SortShell ss = new SortShell();
		ss.sortShell(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	/*
	 基于插入排序-----复杂好多了
1，将有n个元素的数组分为n/2个数字序列，第1个数据和第n/2+1个数据为一对。。。
2，一次循环使每一个序列对排好顺序（对每个序列使用插入排序算法，实质是一种分组插入）
3，然后，再变为n/4个序列，再次排序
4，不断重复上述过程，随着序列减少最后变为一个，也就完成了整个排序。
	 */
	public void sortShell(int[] arr) {
		
		int len = arr.length;
		for(int r = len/2; r >= 1; r = r/2) {
			//进行插入排序
			for(int i = r; i < len; i++) {
				int tem = arr[i];
				int j =  i - r;
				while(j >= 0 && tem < arr[j]) {
					arr[j + r] = arr[j];
					j -= r;
				}
				arr[j + r] = tem;
			}
		}
	}

}
