package StrategyPattern;

/**
 * 
 * Ѽ����Ļ���
 * 
 * ������Ϊ�� swim()��display()�� ��������Ϊ:fly()��quack()
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
