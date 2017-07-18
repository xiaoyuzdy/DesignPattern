package DecoratorPattern;

/**
 * 具体装饰类
 * 
 * @author he
 *
 */
public class Mocha extends CondimentDecorator {
	Beverage beverage;//被装饰者

	public Mocha(Beverage beverage) {
		this.beverage = beverage;  
	}

	@Override
	public String getDesription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	double cost() {
		// TODO Auto-generated method stub
		return 0.20 + beverage.cost();
	}

}
