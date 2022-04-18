package RecursionClasses;

import java.util.Scanner;

public class LastIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int m=sc.nextInt();
        int i= arr.length-1;
        System.out.println(findingIndex(arr,m,i));
	}
	public static int findingIndex(int[] arr, int m, int i) {
        if(i<0)
            return -1;
        if(arr[i]==m) {
            //System.out.println(i);
            return i;
        }
        return findingIndex(arr,m,i-1);
    }

}
