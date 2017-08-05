package IteratorPattern;

/**
 * 
 * @author he
 *
 */
public class Waitress {
	private PancakeHouseMenu pancakeHouseMenu;
	private DinerMenu dinerMenu;

	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}

	public void printMenu() {
		Iterator pIterator = pancakeHouseMenu.createIterator();
		Iterator dIterator = dinerMenu.createIterator();

		System.out.println("MENU \n-----\n BREAKFAST");
		printMenu(pIterator);
		System.out.println("\n LUNCH");
		printMenu(dIterator);

	}

	private void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem item = (MenuItem) iterator.next();
			System.out.println(item.getName() + "  ,");
			System.out.println(item.getDescription() + "  ");
			System.out.println(item.getPrice());
		}
	}

}
