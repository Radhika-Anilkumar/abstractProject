package abstractAssmt12Prgm1;

public class ContractorClass extends FullTimeEmployee
{
	int s;
	int perHourRate=250;
	public void calculateSalary()
	{
		s=perHourRate*8;
		System.out.println("Salary for contract employee is "+s);
	}
	public void calculateSalaryFullTym()
	{
		s=perHourRate*12;
		System.out.println("Salary for full time employee is "+s);
	}
	public static void main(String[] args) 
	{
		ContractorClass c=new ContractorClass();
		c.calculateSalary();
		c.calculateSalaryFullTym();
	}
}
