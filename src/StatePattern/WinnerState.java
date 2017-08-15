package StatePattern;

/**
 * Ӯ��״̬
 * 
 * @author he
 *
 */
public class WinnerState implements State {

	GumballMachine gumballMachine;

	public WinnerState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println(" you can't insert a quarter,the machine is sold out");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("you can't eject,you haven't inserted a quarter yet");
	}

	@Override
	public void turnCrank() {
		System.out.println("you turned,but there are no gumballs");

	}

	@Override
	public void dispense() {
		System.out.println("YOU'RE A WINNER ! you get two gumballs for your quarter");
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() == 0) {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		} else {
			gumballMachine.releaseBall();
			if (gumballMachine.getCount() > 0) {
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			} else {
				System.out.println("Oops , out of gumballs");
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		}
	}

}
