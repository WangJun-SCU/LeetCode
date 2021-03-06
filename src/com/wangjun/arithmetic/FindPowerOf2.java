package com.wangjun.arithmetic;

/**
 * 找出大于n的最小的2的幂
 * @author wangjun
 * @email scuwangjun@hotmail.com
 * @time 2018年4月6日 下午4:39:31
 */
public class FindPowerOf2 {

	public static void main(String[] args) {
		System.out.println(findIt2(1000000000));
	}

	// 找出大于n的最小的2的幂--第一种方式--好
	public static int findIt1(int n) {
		int i = 1;
		while (i < n) {
			i <<= 1;
		}
		return i;
	}

	// 找出大于n的最小的2的幂--第二种方式--不好
	public static int findIt2(int n) {
		while (!isTwo(n)) {
			n++;
		}
		return n;
	}

	// 判断是否是2的幂
	public static boolean isTwo(int n) {
		while (n > 1) {
			if (n % 2 == 1)
				return false;
			n /= 2;
		}
		return true;
	}
}
