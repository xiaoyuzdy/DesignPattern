package DecoratorPattern;

/**
 * 原始的基类
 * 
 * @author he
 *
 */
public abstract class Beverage {
	String description = "Unknown Beverage";

	public String getDescription() {
		return description;
	}

	abstract double cost();
}
