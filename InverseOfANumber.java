package pepCoding_GettingStarted;

import java.util.Scanner;

public class InverseOfANumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		  int n = sc.nextInt();
		  int inverse = 0;
		  
		  int total = (int)Math.log10(n) + 1;
		  
		  for(int i=1; i<=total; i++)
		  {
		      int k = i;
		      int h = n%10;
		      while(--h > 0) {
		          k = k*10;
		      }
		      inverse += k;
		      n = n/10;
		  }
		  
		  System.out.println(inverse);

	}

}
