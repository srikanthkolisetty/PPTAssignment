package Ass;

import java.util.Arrays;
// sort the string
public class Ques8 {
	
	public static void main(String[] args) {
		
		String s="dcba";
		char c[] = s.toCharArray();
		Arrays.sort(c);
		System.out.println(new String(c));
	}

}
