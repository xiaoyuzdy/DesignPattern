package StrategyPattern;

/**
 * 
 * 鸭子类的基类
 * 
 * 共性行为： swim()、display()； 不共性行为:fly()、quack()
 * 
 * @author he
 *
 */
public abstract class Duck {
	QuackBehavior quackBehavior;
	FlyBehavior flyBehavior;

	public void swim() {
		System.out.println("i can swimming");
	}

	public abstract void display();

	// 委托给行为类
	public void performQuack() {
		quackBehavior.quack();
	}

	// 委托给行为类
	public void performFly() {
		flyBehavior.fly();
	}

	public void setFlyBehavior(FlyBehavior fb) {
		this.flyBehavior = fb;
	}

	public void setQuackBehavior(QuackBehavior qb) {
		this.quackBehavior = qb;
	}

}
