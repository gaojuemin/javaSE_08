import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
/*
 * Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.

Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.

The order of output does not matter.

Example 1:

Input:
s: "cbaebabacd" p: "abc"

Output:
[0, 6]

Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".
Example 2:

Input:
s: "abab" p: "ab"

Output:
[0, 1, 2]

Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".
 */

class FindAnagrams {
	public static void main(String[] args) {
		String s = "bacabaabccaabcacbbbc";
		String p = "abc";
		String s1 = "cbaebabacd";
		String p1 = "abc";
		// findAnagrams(s,p);
		// char[] ch1 = p.toCharArray();
		/// Arrays.sort(ch1);
		// String s2 =new String(ch1);
		// System.out.println(s2);
		for (int i = 0; i < findAnagrams(s, p).size(); i++) {
			System.out.print(findAnagrams(s, p).get(i));
			System.out.print(",");

		}
		System.out.println();
		for (int i = 0; i < findAnagrams(s1, p1).size(); i++) {
			System.out.print(findAnagrams(s1, p1).get(i));
			System.out.print(",");
		}
		// System.out.println();
		// for(Integer number : findAnagrams(s1, p1)){
		// System.out.print(number + " ");
		// }
	}

	public static ArrayList<Integer> findAnagrams(String s, String p) {
		ArrayList l = new ArrayList(); // 建立返回的list，简写l
		char[] ch1 = p.toCharArray();
		Arrays.sort(ch1); // 总体思想，课上学过比对字符串
		String p2 = new String(ch1);
		// System.out.println(p2); //这里加一个把需要比对字符串进行排序，这样就可以比对任意顺序的字符串
		for (int i = 0; i < s.length() - p.length(); i++) { // 减去p长度是为了不越界,一个一个比较
			char[] ch2 = (s.substring(i, i + p.length())).toCharArray();// 从index i开始，p长度结束，挨个比较字符串
			Arrays.sort(ch2);
			String s2 = new String(ch2);
			// System.out.println(s2);
			if (s2.indexOf(p2) != -1) { //
				l.add(i);
			}
		}
		return l;
	}
}