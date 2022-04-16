package DATA_STRUCTURES_STRINGS_CB;

import java.util.Scanner;

public class StringsStringCompression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        stringsStringCompress(str);
    }
    public static void stringsStringCompress(String str) 
	{
		int count=1;
		char ch=str.charAt(count);
		for(int i=1;i<str.length();i++)
		{			
			if(ch==str.charAt(i))
			{
				count++;
			}
			else
			{
				System.out.print(ch);
				if(count>1){System.out.print(count);} 
				ch=str.charAt(i);
				count=1;
			}
		}
			System.out.print(ch);
			if(count>1){System.out.print(count);} 
	}
   
}
