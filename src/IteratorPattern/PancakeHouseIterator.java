package IteratorPattern;

import java.util.List;

/**
 * 使用迭代器 包装 List，这样可以对外提供统一的接口 hasNext() next()
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
