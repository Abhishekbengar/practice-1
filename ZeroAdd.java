import java.io.*;
import java.util.*;

class ZeroAdd{

	public static void main(String [] args){
		int num,result=0;
		Scanner sc=new Scanner(System.in);

		do{

			System.out.println("enter the numbers:");
		
			num=sc.nextInt();

			result=result+num;

		}while(num!=0);
	
		System.out.println("Result="+result);
	}
}



