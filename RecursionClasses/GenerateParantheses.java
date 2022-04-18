package RecursionClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenerateParantheses {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Parenthesis(n, 0, 0, "");
		//System.out.println(list);
		}

	public static void Parenthesis(int n, int opening, int closing, String ans) {
		if (opening == n && closing == n) {
			System.out.println(ans);
			return;
		}
		if (closing < opening) {
			Parenthesis(n, opening, closing + 1, ans + ")");
		}
		if (opening < n) {
			Parenthesis(n, opening + 1, closing, ans + "(");
		}
		

	}
	    
}
