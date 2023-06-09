package mavenPackage;

public class HDFC41 implements RBI41 {
	public void recurringDeposit(float amount,float duration)
	{
		float simpleinterest=amount*duration*rateofinterest;
	    System.out.println("Simple Interest :"+simpleinterest);
	}

}
