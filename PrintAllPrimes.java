package pepCoding_GettingStarted;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintAllPrimes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        boolean flag = true;
        // arr.add(2);
        // arr.add(3);
        for(int i=a; i<=b; i++)
        {
            flag = true;
            for(int j=2; j*j<=i; j++)
            {
                if(i%j==0) {
                    flag = false;
                    break;
                }
            }
            if(flag)
                arr.add(i);
        }
        
        for(int i=0; i<arr.size(); i++)
            System.out.println(arr.get(i));

	}

}
