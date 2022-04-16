package DATA_STRUCTURES_STRINGS_CB;

import java.util.Scanner;

public class PalindromeSubstrings {
	public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(printSubString(str));
    }
    public static int printSubString(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				String s1 = str.substring(i,j);
				if(isPalidromString(s1) == true) {
					System.out.println(s1);
				}
			}
		}
		return 0;
	}
    public static boolean isPalidromString(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
