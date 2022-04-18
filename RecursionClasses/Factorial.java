package RecursionClasses;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(fact(n));
	}

	public static int fact(int n) {
		// TODO Auto-generated method stub
		// base case 
		if(n == 0) {
			return 1;
		}
		// smaller problem n - 1
		int fn = fact(n-1); // recursion (n-1)!
		return fn * n;
	}
	

}
