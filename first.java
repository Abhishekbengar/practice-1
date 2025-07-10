import java.io.*;
import java.util.*;

class first{
public static void main(String args[])
{
int num=121,r,rem=0,pal=num;
System.out.println("enter the number:");
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
while(num>0)
{
r=num%10;
rev=rev*10+r;
num=num/10;

}
if(rev==pal)
{
System.out.println("palidrome");

}
else{

System.out.println("not palidrome");

}
}
}