package RecursionClasses;

import java.util.Scanner;

public class RecursionSubsequence {
	public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //printSubSeq(str, "");
        //System.out.println(count);
        System.out.println("\n"+printSubSeq1(str, ""));
    }
    public static int printSubSeq1(String ques, String ans) {
		// TODO Auto-generated method stub
		if (ques.length() == 0) {
			System.out.println(ans);
			return 1;
		}

		char ch = ques.charAt(0);//a
		int f1 = printSubSeq1(ques.substring(1), ans);
		int f2 = printSubSeq1(ques.substring(1), ans + ch);
		return f1 + f2;
	}
}
