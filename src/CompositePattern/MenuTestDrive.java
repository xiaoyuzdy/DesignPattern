package CompositePattern;

/**
 * ≤‚ ‘¿‡
 * 
 * @author he
 *
 */
public class MenuTestDrive {
	public static void main(String[] args) {
		MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", " Breakfast ");
		MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
		MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);

		dinerMenu.add(new MenuItem(" DinerMenu Vegetarian", "Vegetarian description", true, 2.99));
		dinerMenu.add(new MenuItem("DinerMenu BLT", "BLT description", false, 3.99));

		pancakeHouseMenu.add(new MenuItem("PancakeHouseMenu K&B", "K&B description", false, 1.99));
		pancakeHouseMenu.add(new MenuItem("PancakeHouseMenu Waffles", "Waffles description", true, 4.99));

		Waitress waitress = new Waitress(allMenus);
//		waitress.printMenu();
		waitress.printVegetarianMenu();

	}
}
