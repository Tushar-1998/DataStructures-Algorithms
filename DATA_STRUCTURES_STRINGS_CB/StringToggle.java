package DATA_STRUCTURES_STRINGS_CB;

import java.util.Scanner;

public class StringToggle {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		char str[] = sc.next().toCharArray();
		//char str[] = "GeKf@rGeek$".toCharArray();
	    toggleChars(str);
	    //System.out.println("String after toggle ");
	    System.out.println(String.valueOf(str));
	}
	public static void toggleChars(char str[]) {
		for (int i=0; i<str.length; i++)
	    {
	        if (str[i]>='A' && str[i]<='Z') {
	            str[i] = (char) (str[i] + 'a' - 'A');
	        }
	        else if (str[i]>='a' && str[i]<='z') {
	            str[i] = (char) (str[i] + 'A' - 'a');
	        }
	    }
	}
	
}
