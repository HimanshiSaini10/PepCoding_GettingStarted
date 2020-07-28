package pepCoding_GettingStarted;

import java.util.Scanner;

public class RotateANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     int n = sc.nextInt();
	     int k = sc.nextInt();
	     int a = 0;
	     int num = 0;
	     boolean flag = true;
	     if(k<0) {
	         flag = false;
	         k *= -1; }    
	     
	     int digit = (int)Math.log10(n)+1;
	     k = k%digit;
	    //  System.out.println(k);
	     
	     if(k==0){
	         System.out.println(n);
	         return;
	     } else {
	         int arr[] = new int[digit];
           for(int i=digit-1; i>=0; i--) {
               arr[i] = n%10;
               n = n/10;
           }
            
            if(flag) {
                for(int m=0; m<k; m++) {
                    a = arr[digit-1];
                    for(int i=digit-1; i>0; i--)
                        arr[i] = arr[i-1];
                    arr[0] = a;
                }
            } else {
                for(int m=0; m<k; m++) {
                a = arr[0];
                for(int i=0; i<digit-1; i++)
                    arr[i] = arr[i+1];
                arr[digit-1] = a;
                }
            }
            for(int i=0; i<digit; i++){
                num = (num*10) + arr[i];
            }
           System.out.println(num);
	     }
	}
}