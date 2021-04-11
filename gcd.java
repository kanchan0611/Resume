import java.io.*; 
import java.util.*;
import java.util.Scanner;
class gcd
{

     public static void main(String []args)
	 {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        System.out.println(n+"/"+d);
		int gcd=0;
		for(int i=1;i<=n && i<=d;i++)
		{
			if(n%i==0 && d%i==0)
			{
				gcd = i;
			}
		}
		int new_n =n / gcd;
		int new_d =d / gcd;
		System.out.println(new_n+"/"+new_d);
     }
}