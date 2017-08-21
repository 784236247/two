package com.zdl;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("请输入数组个数:");
		int n = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if (n>0) {
			System.out.println("请输入"+n+"个数字");
			int[] array = new int[n];
			boolean ret = getNumberFromStdin(array);
			if (ret) {
				for (int i = 0; i < array.length; i++) {
					System.out.println("array[" + i + "] = " + array[i]);
				}
			}
		}else {
			System.out.println("输入数字有误！！！！");
		}
		
	}

	public static boolean getNumberFromStdin(int[] array) {
		if (array == null || array.length == 0) {
			System.out.println("你是不是傻");
			return false;
		}
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		return true;
	}

}
