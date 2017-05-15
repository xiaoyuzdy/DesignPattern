package StrategyPattern;

/**
 * 具有飞行能力的鸭子的实现类
 * @author he
 *
 */
public class FlyWithWings implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("i can fly");
	}
}
