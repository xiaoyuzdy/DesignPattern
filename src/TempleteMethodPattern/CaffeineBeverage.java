package TempleteMethodPattern;

/**
 * ģ�巽���Ļ��࣬�����㷨���
 * 
 * @author he
 *
 */
public abstract class CaffeineBeverage {

	// ����Ϊfinal��ֹ����д
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments()) {
			addCondiments();
		}

	}

	// �������ʵ�ֵķ���
	abstract void brew();

	abstract void addCondiments();

	void boilWater() {
		System.out.println("Boiling water");
	}

	void pourInCup() {
		System.out.println("Pouring into cup");
	}

	// ����
	boolean customerWantsCondiments() {
		return true;
	}
}
