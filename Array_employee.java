import java.util.Scanner;
class Array_employee
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of employee details you want to store");
		int employees =scan.nextInt();
		String[] names=new String[employees];
		int[] emp_id=new int[employees];
		int[] emp_sal=new int[employees];

		for(int n=0; n<employees; n++)
		{
			System.out.println("Enter the name of the employee " + (n+1));
			names[n]=scan.next();	
		}
		
		for(int id=0; id<employees; id++)
		{
			System.out.println("Enter employee " + (id+1)+ " ID" );
			emp_id[id]=scan.nextInt();
		}

		for(int sal=0; sal<employees; sal++)
		{
			System.out.println("Enter employee " + (sal+1) +" salary");
			emp_sal[sal]=scan.nextInt();
		}


		    System.out.println();
			System.out.println("Displaying the employee details stored");
			System.out.println();
			System.out.println("Displaying all employees names");
			System.out.print("[");
		for(int i=0; i<employees;i++)
			{
			System.out.print(names[i]);
			if(i == names.length-1){
				System.out.println("]");
			}
			else{
			System.out.print(", ");
			}
		}
		System.out.println();
		System.out.println("Displaying all employees Id's");
		System.out.print("[");
		for(int i=0; i<employees;i++)
			{
			System.out.print(emp_id[i]);
			if(i == emp_id.length-1){
				System.out.println("]");
			}
			else{
			System.out.print(", ");
			}
		}
		System.out.println();
		System.out.println("Displaying all employee salaries");
		System.out.print("[");
		for(int i=0; i<employees;i++)
			{
			System.out.print(emp_sal[i]);
			if(i == emp_sal.length-1){
				System.out.println("]");
			}
			else{
			System.out.print(", ");
			}
		}

                System.out.println();
				System.out.println("EMPLOYEE DETAILS HAVING SALARY ABOVE 15000 ARE LISTED BELOW");
				System.out.println();
		for (int i=0;i<employees ;i++ )
		{
			if(emp_sal[i]>=15000)
			{
				
				System.out.println(names[i]);
				System.out.println("Employee ID " + emp_id[i]);
				System.out.println("Employee Salary " + emp_sal[i]);
				
			}
			else
			{
				System.out.println("No Emplyee has salary above 15000");
			}

		}
	}
}