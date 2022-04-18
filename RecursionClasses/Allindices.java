package RecursionClasses;

import java.util.Scanner;

public class Allindices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int [] a= new int [l];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int n=sc.nextInt(); int i=0;
        search(n, a, i );
	}
	public static int  search(int n,int[]a,int i) {
        if(i==a.length){
            return -1 ;
        }
        if (n==a[i]){
            System.out.print(i+" ");
        }
        return search(n, a,i+1);
    }
}
