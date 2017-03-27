
public class TestPrinciple {

	public static void main(String[] args) {
	
		Chain chainCalAdd = new AddNumber();
		Chain chainCalSub = new SubNumber();
		Chain chainCalMul = new MulNumber();
		Chain chainCalDiv = new DivNumber();
		Chain chainCalPow =  new PowerCalculator();
		
		chainCalAdd.setNextChain(chainCalSub);
		chainCalSub.setNextChain(chainCalMul);
		chainCalMul.setNextChain(chainCalDiv);
		chainCalDiv.setNextChain(chainCalPow);
		
		Numbers num = new Numbers(2,4,"power");
		
		chainCalAdd.calculate(num);
		
		
	}

}
