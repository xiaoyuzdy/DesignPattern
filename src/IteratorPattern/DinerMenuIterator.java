package IteratorPattern;

/**
 * ʹ�õ����� ��װ ���飬�������Զ����ṩͳһ�Ľӿ� hasNext() next()
 * 
 * @author he
 *
 */
public class DinerMenuIterator implements Iterator {
	MenuItem[] items;
	int position = 0;

	public DinerMenuIterator(MenuItem[] menuItems) {
		items = menuItems;
	}

	@Override
	public boolean hasNext() {
		if (position >= items.length || items[position] == null) {
			return false;
		}
		return true;
	}

	@Override
	public Object next() {
		MenuItem menuItem = items[position++];
		return menuItem;
	}

}
