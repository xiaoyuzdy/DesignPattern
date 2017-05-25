package FactoryPattern;

/**
 * Pizza�̵�(����)��Ϊ�ͻ��ṩPizza
 * 
 * @author he
 *
 */
public abstract class PizzaStore {
	
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

	/**
	 * �൱�ڴ���Pizza�Ĺ��� 
	 * @param type
	 * @return
	 */
	abstract Pizza createPizza(String type);
	
}
