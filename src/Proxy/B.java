package Proxy;

/**
 * ��̬���� ������ ���м��ࣩ
 * 
 * @author he
 *
 */
public class B {
	private A a;
	
	public B(A a){
		this.a=a;
	}
	
	public void operateMethod1() {
        a.operateMethod1();
    };

    public void operateMethod2() {
        a.operateMethod2();
    };

    // not export operateMethod3()
	
}
