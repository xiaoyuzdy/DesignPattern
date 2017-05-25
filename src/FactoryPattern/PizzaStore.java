package FactoryPattern;

/**
 * Pizza�̵�(����)��Ϊ�ͻ��ṩPizza
 * 
 * @author he
 *
 */
public abstract class PizzaStore {
	SimplePizzaFactory factory;

	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}

	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

	abstract Pizza createPizza(String type);
	
}
