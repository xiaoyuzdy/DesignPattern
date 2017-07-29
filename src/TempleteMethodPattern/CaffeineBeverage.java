package TempleteMethodPattern;

/**
 * 模板方法的基类，定义算法框架
 * 
 * @author he
 *
 */
public abstract class CaffeineBeverage {

	// 定义为final防止被重写
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments()) {
			addCondiments();
		}

	}

	// 子类具体实现的方法
	abstract void brew();

	abstract void addCondiments();

	void boilWater() {
		System.out.println("Boiling water");
	}

	void pourInCup() {
		System.out.println("Pouring into cup");
	}

	// 钩子
	boolean customerWantsCondiments() {
		return true;
	}
}
