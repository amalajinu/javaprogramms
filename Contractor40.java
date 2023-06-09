package mavenPackage;

import java.util.Scanner;

public class Contractor40  extends Employee40{
	void salaryCal()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter the working hours");
		int hour=s.nextInt();
		System.out.println("Enter the amount per hour");
		int amt=s.nextInt();
		float salary=hour*amt;
		System.out.println("Employee id: "+id+" Employee name: "+name);
		System.out.println("Employee Salary "+salary);
		
	}

}
