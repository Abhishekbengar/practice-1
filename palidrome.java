import java.io.*;
import java.util.*;

class palidrome{
public static void main(String args[])
{
int num=121,r,rem=0,pal=num;
num=sc.nextInt();
while(num>0)
{
r=num%10;
r=r*10+r;
num=num/10;

}
if(r==pal)
{
System.out.println("palidrome"+r);

}
else{

System.out.println("not palidrome"+r);

}
}
}