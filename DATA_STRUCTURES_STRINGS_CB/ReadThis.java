package DATA_STRUCTURES_STRINGS_CB;

import java.util.Scanner;

public class ReadThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(convert(str));
	}
	public static String convert(String str) {
		int count = 0;
		int n  = str.length();
		char ch[] = str.toCharArray();
		int res_ind = 0;
		for(int i = 0; i < n; i++) {
			// check for spaces in the sentence
            if (ch[i] == ' ')
            {
                count++;
                // conversion into upper case
                ch[i + 1] = Character.toUpperCase(ch[i + 1]);
            }
            // If not space, copy character
            else
                ch[res_ind++] = ch[i];
        }
        // new string will be resuced by the
        // size of spaces in the original string
        return String.valueOf(ch, 0, n - count);
    }
		
}


