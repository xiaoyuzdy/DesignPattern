package DecoratorPattern;
/**
 * Ũ�����ȣ���������ϣ�
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
