//largest three number 
import java.io.*;
import java.util.*;
class maxthree
{
public static void main(String []args)
{
int n1,n2,n3;
System.out.println("enter the numeber");
Scanner sc=new Scanner(System.in);
n1=sc.nextInt();
n2=sc.nextInt();
n3=sc.nextInt();

if(n1>=n2 && n1>=n3)
System.out.println("lagetest:"+n1);
else if(n2>=n1 && n2>=n3)
System.out.println("largest:"+n2);
else
System.out.println("largest:"+n3);
}
}

