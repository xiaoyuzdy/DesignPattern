package SingletonPattern;

/**
 * 单例模式
 * 
 * @author he
 *
 */
public class Signleton {
	private volatile static Signleton signleton;
	
//	private static Signleton signleton=new Signleton();//对应第四中方式
	
	private Signleton() {
	}

	/**
	 * 第一中方式：缺点，多线程访问时不安全
	 * @return
	 */
//	public static Signleton getInstance(){
//		if (signleton==null) {
//			signleton=new Signleton();
//		}
//		return signleton;
//	}
	
	
	/**
	 * 第二中方式 加上同步关键字，解决了多线程访问安全的问题
	 * 缺点：会降低性能，因为一旦设置好signleton变量，就不需要同步了，之后每次调用该方法会降低性能
	 * @return
	 */
//	public static synchronized Signleton getInstance(){
//		if (signleton==null) {
//			signleton=new Signleton();
//		}
//		return signleton;
//	}
	
	
	/**第三种方式，
	 * 双重检查加锁，首先检查实例是否已经创建，如果未创建才进行同步控制，
	 * 这样只有第一次会同步，提高了性能
	 * @return
	 */
	public static  Signleton getInstance(){
	if (signleton==null) {
		synchronized(Signleton.class){
			if (signleton==null) {
				signleton=new Signleton();
			}
		}
		signleton=new Signleton();
	}
	return signleton;
   }
	
	/**
	 * 第四中方式，如果应用程序总是创建并使用单例实例，可以在镜头初始化器中创建单例，
	 * 使用时直接返回
	 * @return
	 */
//	public static  Signleton getInstance(){
//	
//		return signleton;
//	  }
	
	
	
	
}
