package mavenPackage;

import java.util.Scanner;

public class User39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank39 b=new Bank39();
		b.setPin(1001,1234,1212);
		Scanner s=new Scanner(System.in);
		System.out.println("Pleae enter the pin");
		int val=s.nextInt();
		switch(val)
		{
		case 1001:b.setvalid(1001);
		break;
		case 1234:b.setvalid(1234);
		break;
		case 1212:b.setvalid(1212);
		break;
		default:System.out.print("PinNoisnotvalid");


		}
		}


	}

