package FactoryPattern;

/**
 * Pizza商店(基类)，为客户提供Pizza
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
	 * 相当于创建Pizza的工厂 
	 * @param type
	 * @return
	 */
	abstract Pizza createPizza(String type);
	
}
