package test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
7
public class Testcoding {
	public static void main(String[] args) {
		String s = " kiwi papaya melon ";
		String answer = "";
		String[] datas = s.split(" ");

		for(int i =0; i < datas.length; i++) {
			for(int j = 0; j < datas[i].length(); j++ ) {
				
				if(j % 2 != 0) {
					answer += Character.toLowerCase(datas[i].charAt(j));
				}else {
					answer += Character.toUpperCase(datas[i].charAt(j));
				}
				
			}
			if(datas.length -1 > i && datas[i].length() != 0) {
				answer += " ";	
			}
		}
		System.out.println(answer);
	}
}
