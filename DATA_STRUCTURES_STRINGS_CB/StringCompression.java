package DATA_STRUCTURES_STRINGS_CB;

import java.util.Scanner;

public class StringCompression {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		compressedString(str);
		sc.close();
		
	}
	public  static void compressedString(String str) {
		// TODO Auto-generated method stub
		char prev = str.charAt(0);
		int count = 1;
		int i;
		for (i = 1; i < str.length(); i++) {
			if (str.charAt(i) == prev) {
				count++;
			} else {
				System.out.print(str.charAt(i - 1));
				System.out.print(count);
				count = 1;
				prev = str.charAt(i);
			}
		}
		System.out.print(str.charAt(i - 1));
		System.out.print(count);
		
	}

}
