package mavenPackage;

import java.util.Scanner;

abstract class Employee40 {
	int id;
	String name;

	void empDetails()

	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the empid");
		int id = s.nextInt();
		this.id = id;
		System.out.println("Enter the name");
		String name = s.next();
		this.name = name;
	}
	abstract void salaryCal();
}
