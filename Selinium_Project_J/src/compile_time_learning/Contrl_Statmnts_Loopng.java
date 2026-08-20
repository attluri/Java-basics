package compile_time_learning;

public class Contrl_Statmnts_Loopng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//While:	print 1 to 10 numbers
		
	/*int a=1;
		while (a<=10)
		{
			System.out.println(a);
			a++;
		}*/
//do while: print 1 to 10
		/*int i =11;
		do
		{
			System.out.println(i);
			i++;
		}
		while (i<=10); */
// for:
		for (int b=1;b<=10;b++)
		{
			System.out.println(b);
		}
	}

}

/* 2. Looping / iterative  statements: 3 types --> while, do while, for --> in hierarchy for > do while > while
 
 	i: While statement: loop is executed till condition is satisfied / user should be clear of condition then use this statement / condition is given first /
 		 	/ no semi column after condition
 			
 			Syntax: while (condition)
 					{
 					}
	ii: do while statement: condition is checked last / even if condition is not satisfied one time output is expected / semi column after condition
			Syntax: do
					{
					}
					while (condition);
	iii: for: use this if user is clear of proper initialization, condition checking and execution
			Syntax: for (condition1; condition 2; condition 3)
					{
					}		
Question: what happens if condition is given wrong - results in infinite loop like (int a=1; a<=10, a--)
*/