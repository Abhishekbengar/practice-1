//max two number
import java.io.*;
import java.util.*;
class maxtwo
{
public static void main(String []args)
{
int n1,n2,n3;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
n1=sc.nextInt();
n2=sc.nextInt();
n3=sc.nextInt();

if(n1>=n2 && n1<=n3 || n1<=n2 && n1<=n3)
System.out.println("second max number:"+n1);
else if(n2>=n1 && n2>=n3 || n2<=n1 && n2<=n3)
System.out.println("second max number:"+n2);
else
System.out.println("second max number:"+n3);
}
}
