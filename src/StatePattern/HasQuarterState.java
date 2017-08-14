package StatePattern;

/**
 * 可以售卖的状态
 * 
 * @author he
 *
 */
public class HasQuarterState implements State {

	
	GumballMachine gumballMachine;

	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println(" you can't insert another quarter");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Quarter returned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		System.out.println("you turned...");
		gumballMachine.setState(gumballMachine.getSoldOutState());
	}

	@Override
	public void dispense() {
		System.out.println("No gumball dispensed");

	}

}
