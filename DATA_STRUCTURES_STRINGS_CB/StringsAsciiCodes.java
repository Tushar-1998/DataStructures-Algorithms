package DATA_STRUCTURES_STRINGS_CB;

import java.util.Scanner;

public class StringsAsciiCodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(stringDifferenceInAsciiCodes(str));
	}
	public static String stringDifferenceInAsciiCodes(String str) {
		StringBuilder ansString = new StringBuilder();
        int i;
        for (i=0; i<str.length()-1; i++) {
            int diffrence = str.charAt(i+1) - str.charAt(i);
            ansString.append(str.charAt(i)).append(diffrence);
        }
        ansString.append(str.charAt(i));
        return ansString.toString();
    }
}
