package com.wangjun.leetcode;
import java.util.LinkedHashMap;
import java.util.Map;

/*
给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。

案例:

s = "leetcode"
返回 0.

s = "loveleetcode",
返回 2.
 */
public class LeetCode9 {

	public static void main(String[] args) {
		LeetCode9 lc = new LeetCode9();
		System.out.println(lc.firstUniqChar3("loveleetcode"));
	}
	
	//解法1 用时：67ms 战胜：44.67%
	public int firstUniqChar(String s) {
        int len = s.length();
        boolean tag = false;
        for(int i = 0; i < len; i++) {
        		tag = false;
        		for(int j = 0; j < len; j++) {
        			if(i == j) {
        				continue;
        			}else if(s.charAt(i) == s.charAt(j)) {
        				tag = true;
        				break;
        			}
        		}
        		if(!tag) {
        			return i;
        		}
        }
        return -1;
    }
	//解法2 用时：95ms 战胜：27.15%
	public int firstUniqChar2(String s) {
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			map.put(c, map.getOrDefault(c, 0) +1);
		}
		Character c = null;
		for(Map.Entry<Character, Integer> entry: map.entrySet()) {
			if(entry.getValue() == 1) {
				c = entry.getKey();
				break;
			}
		}
		if(c == null)
			return -1;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == c) {
				return i;
			}
		}
		return -1;
    }
	// 解法3，利用char可以转成ASCII码  用时：28ms  战胜：74.57%
	public int firstUniqChar3(String s) {
		int[] arr = new int[26];
		for(int i = 0; i < s.length(); i++) {
			arr[s.charAt(i) - 'a']++;
		}
		for(int i = 0; i < s.length(); i++) {
			if(arr[s.charAt(i) - 'a'] == 1) {
				return i;
			}
		}
		return -1;
	}

}
