package IteratorPattern;

import java.util.List;

/**
 * ʹ�õ����� ��װ List���������Զ����ṩͳһ�Ľӿ� hasNext() next()
 * @author he
 *
 */
public class PancakeHouseIterator implements Iterator {
	List<MenuItem> items;
	int index;

	public PancakeHouseIterator(List<MenuItem> list) {
		items = list;
	}

	@Override
	public boolean hasNext() {
		if (index >= items.size()) {
			return false;
		}
		return true;
	}

	@Override
	public Object next() {
		return items.get(index++);
	}

}
