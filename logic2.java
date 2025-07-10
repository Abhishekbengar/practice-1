import java.io.*;
import java.util.*;
class logic2{
public static void main(String []args)
{
int num,i;
String="","one hundred","two hundred ","three hundred "," hundred four"," hundred five";


Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
num=sc.nextInt();

for(i=100; i<=200; i++)
{
if(i==num)
{
System.out.printn("in words"+convert(i));
}
}

}
}

