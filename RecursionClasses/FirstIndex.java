package RecursionClasses;

import java.util.*;
public class FirstIndex {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
		}
        int item = sc.nextInt();
        int f1 = FistIndex(arr, 0, item);
        System.out.println(f1);
        
    }
    public static int FistIndex(int[] arr, int i, int item) {
		if (i == arr.length) {
			return -1;
		}
		if (arr[i] == item) {
			return i;
		}
		return FistIndex(arr, i + 1, item);
	}
}