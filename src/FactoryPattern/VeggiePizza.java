package FactoryPattern;
/**
 * 某个Pizza的具体实现类
 * @author he
 *
 */
public class VeggiePizza extends Pizza {

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
		System.out.println("这是普通的VeggiePizza");
	}

	@Override
	void pizza() {
		// TODO Auto-generated method stub
		
	}

}
