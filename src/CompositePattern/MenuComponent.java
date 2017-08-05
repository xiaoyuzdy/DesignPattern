package CompositePattern;

import java.util.Iterator;

/**
 * ����������ӿ�,ΪҶ�ڵ����Ͻڵ��ṩ��ͬ�Ľӿ�
 * ��Щ����ֻ��Ҷ�ڵ������壬��Щ����ֻ����Ͻڵ������壬��ˣ�Ĭ��ʵ�ֶ��׳�UnsupportedOperationException()�쳣
 * 
 * @author he
 *
 */
public abstract class MenuComponent {
	public void add(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}

	public void remove(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}

	public MenuComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}

	public String getName() {
		throw new UnsupportedOperationException();
	}

	public String getDescription() {
		throw new UnsupportedOperationException();
	}

	public double getPrice() {
		throw new UnsupportedOperationException();
	}

	public boolean isVegetarian() {
		throw new UnsupportedOperationException();
	}

	public void print() {
		throw new UnsupportedOperationException();
	}

	abstract Iterator createIterator();

}
