package pepCoding_GettingStarted;

import java.util.Scanner;

public class GCDandLCM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      int a = sc.nextInt();
	      int b = sc.nextInt();
	      
	      int GCD = gcd(a,b);
	      int LCM = (a*b)/GCD;
	      System.out.println(GCD);
	      System.out.println(LCM);
	     }
	     
	     public static int gcd(int a, int b) {
	         if(a%b==0)
	            return b;
	            
	         return gcd(b,a%b);
	     }
	    }