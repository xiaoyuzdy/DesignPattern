package FactoryPattern;

/**
 * 某个具体的Pizza
 * @author he
 *
 */
public class CheesePizza  extends Pizza{

	@Override
	void prepare() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void bake() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void cut() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void box() {
		System.out.println("这是普通的CheesePizza");
		
	}

	@Override
	void pizza() {
		// TODO Auto-generated method stub
		
	}

}
