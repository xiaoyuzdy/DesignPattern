package CompositePattern;

public class Waitress {
	MenuComponent allMenus;

	public Waitress(MenuComponent menuComponent) {
		allMenus = menuComponent;
	}

	public void printMenu() {
		allMenus.print();
	}

}
