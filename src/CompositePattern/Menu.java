package CompositePattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 组合节点
 * 
 * @author he
 *
 */
public class Menu extends MenuComponent {
	private ArrayList<MenuComponent> mComponents = new ArrayList<>();
	String name;
	String description;

	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}

	@Override
	public void add(MenuComponent menuComponent) {
		mComponents.add(menuComponent);
	}

	@Override
	public void remove(MenuComponent menuComponent) {
		mComponents.remove(menuComponent);
	}

	@Override
	public MenuComponent getChild(int i) {
		return mComponents.get(i);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public void print() {
		System.out.println(toString());
		System.out.println("--------------------------------");
		Iterator<MenuComponent> iterator = mComponents.iterator();
		while (iterator.hasNext()) {
			iterator.next().print();
		}
	}

	@Override
	public String toString() {
		return "Menu [name=" + name + ", description=" + description + "]";
	}

}
