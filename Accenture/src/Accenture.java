	import java.util.Scanner;
	
	public class Accenture {
	    private static final boolean[][] A = null;
	
		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);       
	        int n = sc.nextInt();           //declared n as integer and take value of n from user ny creating sc object of scanner class
	        int[] gifts = new int[n];
	        int sum = 0;       //initilaize sum=0 
	        for (int i = 0; i < n; i++) {
	            gifts[i] = sc.nextInt();
	            sum += gifts[i];
	        }
	        if (sum % 2 == 1) {                         //checking the condition to chekc whether sum%2==1
	            System.out.println("No");             //If the sum is odd, it's not possible to divide the gifts into two sets of equal sum, so we output "No" and exit the program.
	            return;                             //return statement
	        }
	        int halfSum = sum / 2;
	        boolean[][] A = new boolean[n + 1][halfSum + 1];
	        A[0][0] = true;                             //initialize true 
	        for (int i = 1; i <= n; i++) {
	            for (int j = 0; j <= halfSum; j++) {
	                if (j >= gifts[i - 1]) {
	                    A[i][j] = A[i - 1][j] || A[i - 1][j - gifts[i - 1]];
	                } else {
	                    A[i][j] = A[i - 1][j];
	                }
	            }
	        }
	        if (!A[n][halfSum]) {
	            System.out.println("No");
	            return;
	        }
	        System.out.println("Yes");
	        int i = n, j = halfSum;
	        while (i > 0 && j >= 0) {
	            if (A[i - 1][j]) {
	                i--;
	            } else {
	                System.out.print(gifts[i - 1] + " ");
	                j -= gifts[i - 1];
	                i--;
	            }
	        }
	        System.out.println();
	        i = n;
	        j = halfSum;
	        while (i > 0 && j >= 0) {
	            if (A[i - 1][j]) {
	                i--;
	            } else {
	                System.out.print(gifts[i - 1] + " ");
	                j -= gifts[i - 1];
	                i--;
	            }
	        }
	        System.out.println();
	    }
	}
