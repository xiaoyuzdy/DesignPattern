package DecoratorPattern;

/**
 * ����װ����
 * 
 * @author he
 *
 */
public class Mocha extends CondimentDecorator {
	Beverage beverage;//��װ����

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
