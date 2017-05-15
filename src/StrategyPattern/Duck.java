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
public class Duck {
	QuackBehavior quackBehavior;
	FlyBehavior flyBehavior;

	public void swim() {
		System.out.println("i can swimming");
	}

	public void display() {

	}

	public void performQuack() {
		quackBehavior.quack();
	}

	public void performFly() {
		flyBehavior.fly();
	}

}
