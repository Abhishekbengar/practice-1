import java.io.*;
import java.util.*;
class abstraction{
	
	public static void main(String[] args)
	{
		car obj=new car();
		obj.start();
	


abstract class vehicle{
	abstract void start();
	
}
class car extends vehicle{
	void start()
	{
		System.out.println("start the car");
		
	}
	
}
class motarcycle extends vehicle{
	void start()
	{
		System.out.println("start the motercycle");
		
	}
}
}
}

