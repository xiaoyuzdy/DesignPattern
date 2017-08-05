package CompositePattern;

import java.util.Iterator;

/**
 * 基础的组件接口,为叶节点和组合节点提供共同的接口
 * 有些方法只对叶节点有意义，有些方法只对组合节点有意义，因此，默认实现都抛出UnsupportedOperationException()异常
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
