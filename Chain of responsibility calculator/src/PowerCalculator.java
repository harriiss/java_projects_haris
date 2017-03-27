
public class PowerCalculator implements Chain {
	
	private Chain nextInChain;
	public int num;
	public void setNextChain(Chain nextChain)
	{
		nextInChain = nextChain;
	}
	
	public void calculate(Numbers request)
	{
		if(request.getCalcMethod() == "power")
		{
			num = request.getNumber1();
			for(int i=2;i<=request.getNumber2();i++)
			{
				num = num * request.getNumber1();
				
			}
			System.out.println(request.getNumber1()+"^"+request.getNumber2()+"=" + num);
		}
		else
			nextInChain.calculate(request);
	}
	

}
