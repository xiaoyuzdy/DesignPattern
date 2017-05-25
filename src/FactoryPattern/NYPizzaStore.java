package FactoryPattern;

/**
 * 不同区域的Pizza商店， 纽约的Pizza商店
 * 
 * @author he
 *
 */
public class NYPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("cheese")) {
			pizza = new NYCheesePizza();
		} else if (type.equals("veggie")) {
			pizza = new NYVeggiePizza();
		}
		return pizza;
	}

}
