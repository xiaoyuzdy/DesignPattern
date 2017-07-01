package DecoratorPattern;

/**
 * 具体的饮料
 * @author he
 *
 */
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
