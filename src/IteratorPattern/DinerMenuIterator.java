package IteratorPattern;

/**
 * 使用迭代器 包装 数组，这样可以对外提供统一的接口 hasNext() next()
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
