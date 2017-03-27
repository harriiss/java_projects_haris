
public class Numbers {

	private int num1;
	private int num2;
	
	private String calculationMethod;
	
	public Numbers(int newnum1,int newnum2,String calcMethod)
	{
		this.num1 = newnum1;
		this.num2 = newnum2;
		this.calculationMethod = calcMethod;
	}
	
	public int getNumber1()
	{
		return num1;
	}
	public int getNumber2()
	{
		return num2;
	}
	public String getCalcMethod()
	{
		return calculationMethod;
	}
}
