package FactoryPattern;

/**
 * 简单工厂类 为客户创建Pizza类，处理创建对象的具体细节
 * 
 * 
 * @author he
 *
 */
public class SimplePizzaFactory {

	/**
	 * 这里不采用static方法 ，static方法 优点：不需要使用创建对象的方法来实例化对象。 缺点：不能通过继承来改变创建方法行为
	 * 
	 * @param type
	 * @return
	 */
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza();
		}

		return pizza;
	}
}
