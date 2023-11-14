package abstractProgram;

public abstract class AbstractEg 
{
	public void setUp()
	{
		System.out.println("Setup methord");
	}
	public void tearDown()
	{
		System.out.println("Teardown methord");
	}
	public abstract void process();
	
}
