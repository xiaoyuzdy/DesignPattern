package SingletonPattern;

import java.io.ObjectStreamException;

/**
 * 单例模式
 * 
 * @author he
 *
 */
public class Signleton {
	// private volatile static Signleton signleton;

	// private static Signleton signleton = new Signleton();// 对应第四中方式

	private Signleton() {
	}

	// /**
	// * 第一中方式：缺点，多线程访问时不安全
	// *
	// * @return
	// */
	// public static Signleton getInstance() {
	// if (signleton == null) {
	// signleton = new Signleton();
	// }
	// return signleton;
	// }

	/**
	 * 第二中方式 加上同步关键字，解决了多线程访问安全的问题
	 * 缺点：会降低性能，因为一旦设置好signleton变量，就不需要同步了，之后每次调用该方法会降低性能
	 * 
	 * @return
	 */
	// public static synchronized Signleton getInstance() {
	// if (signleton == null) {
	// signleton = new Signleton();
	// }
	// return signleton;
	// }

	/**
	 * 第三种方式， 双重检查加锁，首先检查实例是否已经创建，如果未创建才进行同步控制， 这样只有第一次会同步，提高了性能
	 * 
	 * @return //
	 */
	// public static Signleton getInstance() {
	// if (signleton == null) {
	// synchronized (Signleton.class) {
	// if (signleton == null) {
	// signleton = new Signleton();
	// }
	// }
	// }
	// return signleton;
	// }
	//
	/**
	 * 第四种方式，如果应用程序总是创建并使用单例实例，可以在镜头初始化器中创建单例， 使用时直接返回
	 *
	 * @return
	 */

	// public static Signleton getInstance() {
	//
	// return signleton;
	// }
	//
	/**
	 * 第五种方式，使用静态内部类实现单例,相比饿汉模式不会在第一次加载Signleton类时就初始化sInstance,
	 * 只有在调用getInstance时才会初始化
	 */

	public static Signleton getInstance() {
		return SignletonHolder.sInstance;
	}

	private static class SignletonHolder {
		private static final Signleton sInstance = new Signleton();
	}

	/**
	 * 第六种方式，通过枚举实现单例，好处：默认线程安全，在任何情况下都是单例，即使在反序列化的时候
	 */

//	public enum SingletonEnum {
//		INSTANCE;
//		// TODO 一些类的方法
//		public void doSomthing() {
//
//		}
//	}

	/**
	 * 加入该方法杜绝在反序列化时重写生成对象
	 *
	 * @return
	 * @throws ObjectStreamException
	 */
	private Object readResolve() throws ObjectStreamException {
		return SignletonHolder.sInstance;

	}

}
