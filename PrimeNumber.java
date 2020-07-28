package pepCoding_GettingStarted;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	       int t = scn.nextInt();
	       while(t-- > 0)
	       {
	           int n = scn.nextInt();
	           boolean flag = true;
	           for(int i=2; i*i <= n; i++){
	               if(n%i==0) {
	                   flag = false;
	                   break;
	               }
	           }
	            if(flag)
	                System.out.println("prime");
	            else
	                System.out.println("not prime");
	       }

	}

}
