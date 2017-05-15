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
public abstract class Duck {
	QuackBehavior quackBehavior;
	FlyBehavior flyBehavior;

	public void swim() {
		System.out.println("i can swimming");
	}

	public abstract void display();

	// ί�и���Ϊ��
	public void performQuack() {
		quackBehavior.quack();
	}

	// ί�и���Ϊ��
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
