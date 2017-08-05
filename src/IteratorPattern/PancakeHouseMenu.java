package IteratorPattern;

import java.util.ArrayList;

/**
 * 一份菜单，内部使用List
 * 
 * @author he
 *
 */
public class PancakeHouseMenu {
	ArrayList<MenuItem> menuItems;

	public PancakeHouseMenu() {
		menuItems = new ArrayList<>();
		addItem("PancakeHouseMenu K&B", "K&B description", true, 1.99);
		addItem("PancakeHouseMenu Waffles", "Waffles description", true, 4.99);
	}

	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
	
	public Iterator createIterator() {
		return new PancakeHouseIterator(menuItems);
	}

}
