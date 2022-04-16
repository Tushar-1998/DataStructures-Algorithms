package DATA_STRUCTURES_STRINGS_CB;
import java.util.Scanner;
public class StringsOddEven {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		stringOddEven(s);

	}
	public static void stringOddEven(String s) {
        String ans="";
		for(int i=0;i<s.length();i++) {
			int x=(int)s.charAt(i);
		
			if(i%2==0) {
				int c=x+1;
				char ch=(char)c;
				ans = ans + ch;
			}
			else {
				int cw=x-1;
				char cb=(char)cw;
				 ans = ans + cb;
			}
		}
        System.out.println(ans);
	}
}
