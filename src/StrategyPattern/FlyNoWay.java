package StrategyPattern;

/**
 * 不具有飞行能力的鸭子的实现类
 * 
 * @author he
 *
 */
public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("i can't fly");
	}

}
