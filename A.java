import java.io.*;
import java.util.*;
class A
{
int add(int a, int b, int c)
{

return a+b+c;
}
int add(int x)
{
return x;
}
public static void main(String [] args)
{
A s1=new A();
System.out.println(s1.add(10,20,30));
System.out.println(s1.add(100));

}
}
