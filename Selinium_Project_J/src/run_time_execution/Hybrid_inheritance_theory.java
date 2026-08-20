package run_time_execution;

class C1
{
	int a = 20;
	void m1()
	{
		System.out.println(a);
	} 
}

interface I1
{
	int b= 40;
	void m2();
}

interface I2
{
	int c= 30;
	void m3();
}
//here we have 2 class and 2 interface -- first extend class A1 to public class then implement interfaces as below

public class Hybrid_inheritance_theory extends C1 implements I1, I2
{
	public void m2()
	{
		System.out.println(b);
	}
	
	public void m3()
	{
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hybrid_inheritance_theory OB = new Hybrid_inheritance_theory();
		OB.m1();
		OB.m2();
		OB.m3();

	}

}
/* Hybrid Inheritance: combination of Hierarchical and multiple inheritance
					-->  parent -- child1 -- child2 -- child3 which have ch1 and ch2 as parents
					--> here parent and child3 are classes and child1 and child2 are interface
*/