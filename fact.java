import java.io.*;
import java.util.*;

class fact{
public static void main(String [] args){
int num,fact=1,i;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
if(num<0){
System.out.println("not fact number this this is negative number");
}
for(i=1; i<=num; i++)
{
fact*=i;
}
System.out.println("this is factorial number"+fact);

}
}
