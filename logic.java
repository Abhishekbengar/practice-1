import java.io.*;
import java.util.*;
 
class logic{
public static void main(String [] args)
{
int num,result;
Scanner sc=new Scanner(System.in);
System.out.println("enter any number");
num=sc.nextInt();
//System.out.println("number is:"+num);
switch(num)
{
case 0:
System.out.println("zero:"+num);
break;

case 1:
System.out.println("one"+num);
break;

case 2:
System.out.println("two"+num);
break;

case 3:
System.out.println("three"+num);
break;
case 4:
System.out.println("four"+num);
break;
case 5:
System.out.println("five"+num);
break;
case 6:
System.out.println("six"+num);
break;
case 7:
System.out.println("seven"+num);
break;
case 9:
System.out.println("nine"+num);
break;

case 10:
System.out.println("ten"+num);
break;
}

}
}