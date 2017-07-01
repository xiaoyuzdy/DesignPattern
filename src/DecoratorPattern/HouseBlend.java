package DecoratorPattern;

public class HouseBlend extends Beverage {

	public HouseBlend() {
		description="House Blend Coffee";
	}
	
	@Override
	double cost() {
		// TODO Auto-generated method stub
		return 0.89;
	}

}
