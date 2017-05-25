package FactoryPattern;

/**
 * �򵥹����� Ϊ�ͻ�����Pizza�࣬����������ľ���ϸ��
 * 
 * 
 * @author he
 *
 */
public class SimplePizzaFactory {

	/**
	 * ���ﲻ����static���� ��static���� �ŵ㣺����Ҫʹ�ô�������ķ�����ʵ�������� ȱ�㣺����ͨ���̳����ı䴴��������Ϊ
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
