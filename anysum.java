import java.io.*;
import java.util.*;

public class anysum {

	public static void main(String[] args) {
	
		int num,rem,sum=0;
		
		System.out.println("enter any number:");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
			System.out.println("sum of number:")
		}
		
		
		
		

	}

}
