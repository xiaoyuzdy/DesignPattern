package StrategyPattern;

/**
 * ���з���������Ѽ�ӵ�ʵ����
 * @author he
 *
 */
public class FlyWithWings implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("i can fly");
	}
}
