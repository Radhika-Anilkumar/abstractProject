package abstractProgram;

public class AbstractImplementation extends AbstractEg1
{
	public void process()
	{
		System.out.println("Process method implemented in the normal method");
	}
	public void show()
	{
		System.out.println("Show method implemented in the normal method");
	}
	public static void main(String args[])
	{
		AbstractImplementation a=new AbstractImplementation();
		a.setUp();
		a.tearDown();
		a.process();
		a.show();
		
		//AbstractEg1 ok=new AbstractEg1();//cannot inatantiate  the type AbstractEg1
	}
}
