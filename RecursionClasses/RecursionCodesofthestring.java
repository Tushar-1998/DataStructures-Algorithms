package RecursionClasses;

import java.util.ArrayList;
import java.util.Scanner;

public class RecursionCodesofthestring {

	private static String[] arr;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		ArrayList<String> list = new ArrayList<>();
		Codes_String_Of_String(str, "", list);
		System.out.println(list);
	}
	public static void Codes_String_Of_String(String Ques, String ans, ArrayList<String> list) {
		if (Ques.length() == 0) {
			// System.out.println(ans);
			list.add(ans);
			return;
		}
		char ch = Ques.charAt(0);
		String s = arr[ch - 48];
		Codes_String_Of_String(Ques.substring(1), ans + s, list);

		if (Ques.length() >= 2) {
			String s1 = Ques.substring(0, 2);
			int n = Integer.parseInt(s1);// numeric String --> int convert krega
			if (n <= 26) {
				Codes_String_Of_String(Ques.substring(2), ans + arr[n], list);
			}
		}

	}

}
