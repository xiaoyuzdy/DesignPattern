package DecoratorPattern;
/**
 * 浓缩咖啡（具体的饮料）
 * @author he
 *
 */
public class Espresso  extends Beverage{

	public Espresso() {
		description="Espresso";
	}
	
	@Override
	double cost() {
		// TODO Auto-generated method stub
		return 1.99;
	}
	

}
