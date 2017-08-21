package com.zdl;

import java.util.Arrays;

class ArraysTool {

	public static int halfSerach(int[] array, int find) {
		int mid = 0;
		int Min = 0;
		int Max = array.length - 1;
		mid = (Max + Min) / 2;
		while (mid != find) {
			if (mid < find) {
				Min = mid + 1;
			} else {
				Max = mid - 1;
			}
			if (Min > Max) {
				mid = -1;
				break;
			}
			mid = (Max + Min) / 2;
		}
		return mid;

	}
}

public class ToFindThe {
	public static void main(String[] args) {
		int[] array = { 1, 3, 5, 7, 9, 2, 4, 6, 8, 10 };
		Arrays.sort(array);
		String str = Arrays.toString(array);
		System.out.println("str = " + str);
		// ArraysTool.selectArray(array);
		// ArraysTool.bubblingArray(array);
		int a=  ArraysTool.halfSerach(array, 99);
		System.out.println(a);
	}
}