//area of triangle

import java.io.*;
import java.util.*;

class triangle{
public static void main(String []args)
{
int area , base , heigth;
Scanner sc=new Scanner(System.in);

System.out.println("enter the base:");
base=sc.nextInt();

System.out.println("enter the height");
heigth=sc.nextInt();

area=(base*heigth)/2;


System.out.println("area of triangle:"+area);
}
}