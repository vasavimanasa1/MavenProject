package javaPrograms;

public class MAIN {

	public static void main(String[] args)
	{
		
		Parent p=new Parent();
		p.A();
		p.A(1);
		p.B();
		
		Child1 c1=new Child1();
		System.out.println("***************");
		c1.A();
		c1.A(2);
		c1.D();
		c1.B();
		c1.M1();
		System.out.println("$$$$$$$$$$$Parent through Child");
		
		Parent pc=new Child1();
		pc.A();//Child A
		pc.A(3);//Child A with 1 param
		pc.B();//Parent B
		
		
		
		
		
	}

}
