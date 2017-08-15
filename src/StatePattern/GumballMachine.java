package StatePattern;

public class GumballMachine {
	// ÿ��״̬ӳ�䵽һ����
	// final static int SOLD_OUT = 0;
	// final static int NO_QUARTER = 1;
	// final static int HAS_QUARTER = 2;
	// final static int SOLD = 3;

	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State winnerState;
	
	State state = soldOutState;
	int count = 0;

	public GumballMachine(int numberGumballs) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);

		this.count = numberGumballs;
		// ��Ʒ��������0
		if (numberGumballs > 0) {
			state = noQuarterState;
		}

	}

	public void insertQuarter() {
		state.insertQuarter();
	}

	public void ejectQuarter() {
		state.ejectQuarter();
	}

	public void turnCrank() {
		state.turnCrank();
	}

	void setState(State state) {
		this.state = state;
	}

	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count--;
		}
	}
	
	//-------   ��ȡÿ��״̬     -----------//
	public State getHasQuarterState(){
		return hasQuarterState;
	}
	
	public State getNoQuarterState(){
		return noQuarterState;
	}
	
	public State getSoldOutState(){
		return soldOutState;
	}
	
	public State getSoldState(){
		return soldOutState;
	}
	
	public State getWinnerState(){
		return winnerState;
	}
	
	
	public int getCount(){
		return count;
	}
	
	
	
	
	
	

}
