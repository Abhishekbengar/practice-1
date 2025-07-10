import java.io.*;
import java.util.*;
class rev{
public static void main(String []args)
{
int num,rev=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
num=sc.nextInt();
for(int i=1; i<num; i++)
{
rev=rev*10+num%10;

num=num/10;

}
System.out.println(rev);

}
}