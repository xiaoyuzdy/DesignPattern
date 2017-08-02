package IteratorPattern;

/**
 * 一份菜单，内部用数组实现
 * 
 * @author he
 *
 */
public class DinerMenu {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;

	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];

	}

	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if (numberOfItems >= MAX_ITEMS) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			menuItems[numberOfItems++] = menuItem;
		}
	}

	public Iterator createIterator() {
		return new DinerMenuIterator(menuItems);
	}

}
