package com.gmail.yuomelyanchuk;

public class Main {

	public static void main(String[] args) {
		int max = 1;
		int tmp = 0;

		for (int i = 1000; i < 10000; i++) {
			for (int j = 1000; j < 10000; j++) {
				StringBuilder sb = new StringBuilder();
				tmp = i * j;
				sb.append(tmp);
				if (sb.toString().matches(sb.reverse().toString()) && tmp > max) {
					max = tmp;					
				}
			}		
			

		}
		
		System.out.println("max polyndrom="+max);
	}

}
