package javaPrograms;

public class Poly extends Car
{
	public static void main(String[] args) 
	{

		Car c=new Car();
		Benz b=new Benz();
		Car cb=new Benz();
		
		
		
		
		System.out.println("Car Classsssssssssssssssss");
		c.speed(1);
		c.fillfuel();
		c.engineCapacity();
		c.g();
	
		System.out.println("End of Car classs......");
		System.out.println("******************");
		
		System.out.println("Benz Classsssssssssssssssss");
		
		b.speed(2);
		b.fillfuel();
		b.engineCapacity();
		b.colour();
		b.g();
		System.out.println("End of Benz classs......");
		System.out.println("******************");
		
		
		System.out.println("Benz class reference variable through Car Classsssssssssssssssss");
		
		cb.speed(3);
		cb.fillfuel();
		cb.engineCapacity();
		cb.g();
		
		System.out.println("End of CarBenz classs......");
		System.out.println("******************");
		
		
		
		
		

	}

}
