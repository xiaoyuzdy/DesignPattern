package StatePattern;

public class GumballMachine {
	// ÿ��״̬ӳ�䵽һ����
//	final static int SOLD_OUT = 0;
//	final static int NO_QUARTER = 1;
//	final static int HAS_QUARTER = 2;
//	final static int SOLD = 3;
	
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;

	State state = soldOutState;
	int count = 0;
	
	public GumballMachine(int numberGumballs) {
		soldOutState=new SoldOutState(this);
		noQuarterState=new NoQuarterState(this);
		hasQuarterState=new HasQuarterState(this);
		soldState=new SoldState(this);
		
		this.count=numberGumballs;
		//��Ʒ��������0
		if (numberGumballs>0) {
			state=noQuarterState;
		}
		
	}
	
}
